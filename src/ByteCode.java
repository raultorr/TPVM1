
public class ByteCode {
	
	public static enum ENUM_BYTECODE {push,load,store,add,sub,div,out,halt}
	private ENUM_BYTECODE name;
	private int param;																//Used with instructions: push, store and load
	
	public ByteCode (ENUM_BYTECODE instructionType){								//Normal constructor of the class ByteCode
		this.name = instructionType;	
	}
	
	public ByteCode (ENUM_BYTECODE instructionType, int num){						//Constructor used for the PUSH, STORE, LOAD instructions
		this.name = instructionType;
		this.setParam(num);
	}
	
	public void setParam (int num){
		this.param = num;
	}
	
	public int getParam(){
		return this.param;
	}
}
