
public class CommandParser{

	
		public static Command parse(String line){
			Command command = null;										//Initializes to null
			String[] arrayOfStrings = line.split(" ");					//Splits the big string into an array of string divided by white spaces
			
			
			if (arrayOfStrings[0].equalsIgnoreCase("help")) {	
				command = new Command(Command.ENUM_COMMAND.help);
			} else if(arrayOfStrings[0].equalsIgnoreCase("quit")) {
				command = new Command(Command.ENUM_COMMAND.quit);
			} else if(arrayOfStrings[0].equalsIgnoreCase("newinst")) {
				command = new Command(Command.ENUM_COMMAND.newinst);
			} else if(arrayOfStrings[0].equalsIgnoreCase("run")) {
				command = new Command(Command.ENUM_COMMAND.run);
			} else if(arrayOfStrings[0].equalsIgnoreCase("reset")) {
				command = new Command(Command.ENUM_COMMAND.reset);
			} else if(arrayOfStrings[0].equalsIgnoreCase("replace")) {
				command = new Command(Command.ENUM_COMMAND.replace);
			}
			return command;
		}
}
