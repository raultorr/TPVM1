
public class CommandParser{

	
		public static Command parse(String line){
			Command command = null;										//Initializes to null
			String[] arrayOfStrings = line.split(" ");					//Splits the big string into an array of string divided by white spaces
			
			
			if (arrayOfStrings[0].equalsIgnoreCase("help")) {	
				command = new Command(Command.ENUM_COMMAND.help);
			} else if(arrayOfStrings[0].equalsIgnoreCase("load")) {
				command = new Command(Command.ENUM_COMMAND.load);
			} else if(arrayOfStrings[0].equalsIgnoreCase("store")) {
				command = new Command(Command.ENUM_COMMAND.store);
			} else if(arrayOfStrings[0].equalsIgnoreCase("add")) {
				command = new Command(Command.ENUM_COMMAND.add);
			} else if(arrayOfStrings[0].equalsIgnoreCase("sub")) {
				command = new Command(Command.ENUM_COMMAND.sub);
			} else if(arrayOfStrings[0].equalsIgnoreCase("mul")) {
				command = new Command(Command.ENUM_COMMAND.mul);
			} else if(arrayOfStrings[0].equalsIgnoreCase("div")) {
				command = new Command(Command.ENUM_COMMAND.div);
			} else if(arrayOfStrings[0].equalsIgnoreCase("out")) {
				command = new Command(Command.ENUM_COMMAND.out);
			} else if(arrayOfStrings[0].equalsIgnoreCase("halt")) {
				command = new Command(Command.ENUM_COMMAND.halt);
			}
			return command;
		}
}
