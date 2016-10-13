
public class ByteCodeParser {
	
	public static ByteCode parse (String s){
		ByteCode instruction = null;
		String[] arrayOfStrings = s.split(" ");
		
		if (arrayOfStrings[0].equalsIgnoreCase("push")) {	
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.push, Integer.parseInt(arrayOfStrings[1]));
		} else if(arrayOfStrings[0].equalsIgnoreCase("load")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.load, Integer.parseInt(arrayOfStrings[1]));
		} else if(arrayOfStrings[0].equalsIgnoreCase("store")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.store, Integer.parseInt(arrayOfStrings[1]));
		} else if(arrayOfStrings[0].equalsIgnoreCase("add")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.add);
		} else if(arrayOfStrings[0].equalsIgnoreCase("sub")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.sub);
		} else if(arrayOfStrings[0].equalsIgnoreCase("div")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.div);
		} else if(arrayOfStrings[0].equalsIgnoreCase("out")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.out);
		} else if(arrayOfStrings[0].equalsIgnoreCase("halt")) {
			instruction = new ByteCode(ByteCode.ENUM_BYTECODE.halt);
		}
		
		return instruction;
	}
		
}
