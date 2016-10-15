
public class Command {

	public static enum ENUM_COMMAND {help,quit,newinst,run,reset,replace}
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;	
	
	public Command(ENUM_COMMAND commandType){
			this.command = commandType;
	}
	
	public ENUM_COMMAND getCommandType(){
		return command;
	}
	
	public void setByteCodeInstruction(ByteCode inst){
		this.instruction = inst;
	}
	
	public ByteCode getByteCodeInstruction(){
		return instruction;
	}
	
	public void setReplaceNumber(int n){
		this.replace = n;
	}
	
	public int getReplaceNumber(){
		return replace;
	}
	
	public boolean execute(Engine engine){
		boolean success=false;
		
		
		return success;
	}
	
}
