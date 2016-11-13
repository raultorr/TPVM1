
public class Memory {
	
	private Integer[] memory;
	private int size = 1;
	
	public Memory() {
		memory = new Integer[size];
	}
	
	public boolean write(int pos, int value) {
		int aux; 
		boolean success = true;
		
		if (pos < 0) {
			success = false;
		}
		else {
			if (pos > (memory.length - 1)) {
				aux = pos - (memory.length - 1);
				resize(aux);
			}
			memory[pos] = value;
		}
		return success;
	}
	
	private void resize(int n) {
		Integer[] aux;
		int size;
		
		size =  n + memory.length;
		aux = new Integer[size];
		for(int i = 0; i < memory.length; i++) {
			aux[i] = memory[i];
		}
		memory = aux;
	}
	
	public int read(int pos) {
		int num = 0;
		int aux;
		
		if (pos > (memory.length - 1)) {
			aux = pos - (memory.length - 1);
			resize(aux);
		}
		if(memory[pos] == null) {
			memory[pos] = 0;
		}
		else {
			num = memory[pos];
		}
		return num;
	}
	
	public String toString() {
		String resp="Memory:";
		boolean empty=true;

			for (int i=0; i < memory.length; i++){
				if(memory[i]!=null){
					empty=false;
					resp = resp + " [" + i + "]:" + memory[i];
				}
			}
			if (empty){
				resp = resp + " <empty>";
			}
		
		return resp;
	}
}
