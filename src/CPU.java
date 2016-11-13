public class CPU {
	
	private OperandStack op;
	private boolean finish;
	private Memory memory;
	
	public CPU() {
		op = new OperandStack();
		finish = false;
		memory = new Memory();
	}
	
	public boolean getFinish() {
		return finish;
	}
	
	public boolean execute(ByteCode instr){
		boolean execution = false;
		ByteCode.ENUM_BYTECODE i = instr.getName();
		int n = instr.getParam();
		int aux, result;
		
		switch(i) {
			case push:
				execution = op.addValue(n);
				break;
			case load:
				aux = memory.read(n);
				op.addValue(aux);
				break;
			case store:
				aux = op.takeValue();
				execution = memory.write(n, aux);
				op.deleteValue();
				break;
			case add:
				if(op.getOccupied() < 2) {
					execution = false;
				}
				else {
					aux = op.takeValue();
					op.deleteValue();
					n = op.takeValue();
					op.deleteValue();
					result = aux + n;
					op.addValue(result);
				}
				break;
			case sub:
				if(op.getOccupied() < 2) {
					execution = false;
				}
				else {
					aux = op.takeValue();
					op.deleteValue();
					n = op.takeValue();
					op.deleteValue();
					result = aux - n;
					op.addValue(result);
				}
				break;
			case mul:
				if(op.getOccupied() < 2) {
					execution = false;
				}
				else {
					aux = op.takeValue();
					op.deleteValue();
					n = op.takeValue();
					op.deleteValue();
					result = aux * n;
					op.addValue(result);
				}
				break;
			case div:
				if(op.getOccupied() < 2) {
					execution = false;
				}
				else {
					aux = op.takeValue();
					op.deleteValue();
					n = op.takeValue();
					op.deleteValue();
					result = n / aux;
					op.addValue(result);
				}
				break;
			case out:
				System.out.println("Output: <<"+op.takeValue()+">>\n");
				break;
			case halt:
				finish = true;
				break;
		}
		
		System.out.println(this.toString(instr));
		
		return execution;
	}
		
	public String toString(ByteCode instr) {
		return "\nState of virtual machine after execution of " + instr.toString() + "\n   " + memory.toString() + "\n   " + op.toString();
	}
}