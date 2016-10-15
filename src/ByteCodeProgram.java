import java.util.Arrays;

public class ByteCodeProgram {
	
	private ByteCode[] program;
	
	public void setNextByteCodeInstruction(ByteCode nextInstruction){
		extendByteCodeArrayLength(1);
		program[program.length-1] = nextInstruction;
	}
	
	public void removeLastByteCodeInstruction(){
		reduceByteCodeArrayLength(1);
	}
	
	public ByteCode getByteCodeInstructionOnPosition(int n){
		return program[n];
	}
	
	public void placeByteCodeInstruction(ByteCode newInstruction, int n){
		program[n] = newInstruction;
	}
	
	private void extendByteCodeArrayLength(int n) {
		program = Arrays.copyOf(program,program.length + n );
	}
	
	private void reduceByteCodeArrayLength(int n) {
		program = Arrays.copyOf(program,program.length - n );
	}
	
	public String toString (){
		String result = "";
		if(program.length != 0){
			result="Current program:\n";
				for (int i=0; i < program.length; i++){
			result = result + i + ": " + program[i].toString() + "\n";
			}
		}
		return result;
	}

}