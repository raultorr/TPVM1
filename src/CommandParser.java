
public class CommandParser {
	
	public static Command parse(String line){
		Command command = null;	
		ByteCode instruction = null;	//Initializes to null
		String[] arrayOfStrings = line.split(" ");					//Splits the big string into an array of strings divided by white spaces
		String secondaryRawInput="";
		
		if (arrayOfStrings.length >= 2) {
			secondaryRawInput=arrayOfStrings[1];
			for (int i=2; i<arrayOfStrings.length; i++) {
				secondaryRawInput=secondaryRawInput+" "+arrayOfStrings[i];
			}
		}
		if (arrayOfStrings[0].equalsIgnoreCase("help")) {	
			command = new Command(Command.ENUM_COMMAND.help);
		} else if(arrayOfStrings[0].equalsIgnoreCase("quit")) {
			command = new Command(Command.ENUM_COMMAND.quit);
		} else if(arrayOfStrings[0].equalsIgnoreCase("newinst")) {
			command = new Command(Command.ENUM_COMMAND.newinst);
			instruction = ByteCodeParser.parse(secondaryRawInput);
			command.setByteCodeInstruction(instruction);
		} else if(arrayOfStrings[0].equalsIgnoreCase("run")) {
			command = new Command(Command.ENUM_COMMAND.run);
		} else if(arrayOfStrings[0].equalsIgnoreCase("reset")) {
			command = new Command(Command.ENUM_COMMAND.reset);
		} else if(arrayOfStrings[0].equalsIgnoreCase("replace")) {
			try {
			command = new Command(Command.ENUM_COMMAND.replace);
			command.setReplaceNumber(Integer.parseInt(arrayOfStrings[1]));
			} catch(Exception e) {
				System.err.println("Invalid syntax. Usage: replace <number>");
			}
		}
		return command;
	}
}
