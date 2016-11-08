
public class ByteCodeParser {
	public static ByteCode parse (String s){
		ByteCode instruction = null;
		String[] arrayOfStrings = s.split(" ");
				
		if (arrayOfStrings[0].equalsIgnoreCase("push")) {	
			try {instruction = new ByteCode(ByteCode.ENUM_BYTECODE.push, Integer.parseInt(arrayOfStrings[1]));}
			catch (Exception e) { System.err.println("Invalid syntax. Usage: newinst push <number>"); } //WE KNOW THIS IS A BAD PRACTICE BUT WE WERE TOLD TO DO THIS LIKE THAT BECAUSE WE ARE NOT SUPPOSED TO USE EXCEPTIONS.
		} else if(arrayOfStrings[0].equalsIgnoreCase("load")) {
			try {instruction = new ByteCode(ByteCode.ENUM_BYTECODE.load, Integer.parseInt(arrayOfStrings[1]));}
			catch (Exception e) { System.err.println("Invalid syntax. Usage: newinst load <number>"); }
		} else if(arrayOfStrings[0].equalsIgnoreCase("store")) {
			try {instruction = new ByteCode(ByteCode.ENUM_BYTECODE.store, Integer.parseInt(arrayOfStrings[1]));}
			catch (Exception e) { System.err.println("Invalid syntax. Usage: newinst store <number>"); }
		} else if(arrayOfStrings[0].equalsIgnoreCase("add")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.add);
		} else if(arrayOfStrings[0].equalsIgnoreCase("sub")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.sub);
		} else if(arrayOfStrings[0].equalsIgnoreCase("div")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.div);
		} else if(arrayOfStrings[0].equalsIgnoreCase("mul")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.mul);
		} else if(arrayOfStrings[0].equalsIgnoreCase("out")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.out);
		} else if(arrayOfStrings[0].equalsIgnoreCase("halt")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.halt);
		}
		
		return instruction;
	}
		
}
