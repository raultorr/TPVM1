
public class OperandStack {

	private int[] stack;
	
	public void setValue(int num, int pos){
		this.stack[pos] = num;
	}
	
	public int getValue(int pos) {
		return this.stack[pos];
	}
	
}
