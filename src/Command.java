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
		boolean success = false;
		
		switch(command) {
			case help: 
				success = engine.executeHelp();
				break;
			case quit: 
				success = engine.executeQuit();
				break;
			case newinst: 
				success = engine.executeNewInst(instruction);
				break;
			case run: 
				success = engine.executeRun();
				break;
			case reset: 
				success = engine.executeReset();
				break;
			case replace: 
				success = engine.executeReplace(replace);
		}
		return success;
	}
	

}
