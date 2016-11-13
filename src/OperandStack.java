
public class OperandStack {
	private static final int SIZE_STACK = 1000;
	private int[] stack;
	private int occupied;
	
	public OperandStack() {
		stack = new int[SIZE_STACK];
		occupied = 0;
	}
	
	public void setValue(int num, int pos){
		this.stack[pos] = num;
	}
	
	public int getValue(int pos) {
		return this.stack[pos];
	}
	
	public int getSize() {
		return stack.length;
	}
	
	public boolean addValue(int n) { //Añado el valor de forma ordenada
		boolean success;
		
		if(occupied < (stack.length - 1)) {
			success = true;
			stack[occupied]  = n;
			occupied++;
		}
		else {
			success = false;
		}
		return success;
	}
	
	public int takeValue() { //Saco el valor de menor a mayor
		int value;
		
		value = stack[occupied-1];
				
		return value;
	}
	
	public boolean deleteValue() { //Borro el valor de forma ordenada (borra el ultimo de la pila)
		boolean success = true;
		
		if (occupied < 0) {
			success = false;
		}
		else {
			occupied--;
		}
		return success;
	}
	
	public String toString() {
		String resp="Stack: ";
		if (occupied == 0) {
			resp += "<empty> ";
		} 
		else {
		 for (int i = 0; i < occupied; i++) {
			 resp = resp + stack[i]+ " ";
		 }
		}
		return resp;
	}
	
	  public int getOccupied() {
			return occupied;
		}

}
