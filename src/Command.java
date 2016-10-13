
public class Command {

	public static enum ENUM_COMMAND {help,load,store,add,sub,mul,div,out,halt}
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;	
	
	public Command(ENUM_COMMAND commandType){
			this.command = commandType;
	}
	
	public boolean execute(Engine engine){
		boolean success=false;
		
		
		return success;
	}
	
}
