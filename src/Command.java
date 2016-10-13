
public class Command {

	public static enum ENUM_COMMAND {help,quit,newinst,run,reset,replace}
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
