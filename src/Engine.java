import java.util.Scanner;

public class Engine {
	
	private ByteCodeProgram program;
	private boolean end;
	private CPU cpu;
	private static Scanner scanner = new Scanner(System.in);
	
	public Engine()  {
		program = new ByteCodeProgram();
	    cpu = new CPU();
		end = false;
	}
	
	public void start() {
		String rawInput;
		Command command; 
						
		while(!end){
			System.out.print("> ");	
			rawInput = scanner.nextLine();
			command = CommandParser.parse(rawInput);
			if (command == null) {
				System.err.println("Error: incorrect command");
			} 
			else {
				System.out.println("Starting execution of " + rawInput.toUpperCase());
				if(command.execute(this) == false){
					System.err.println("Error: incorrect execution of the command");
				} else { //EXECUTION WAS SUCCESSFUL
					if(command.getCommandType()!=Command.ENUM_COMMAND.quit)
						System.out.println(program.toString());
				}
			}
		}
		scanner.close();
	}
	
	public boolean executeHelp() {
		
		System.out.println("\n  HELP: Show this help \n"
				+ "  QUIT: Close the application \n"
				+ "  RUN: Execute the program \n"
				+ "  NEWINST BYTECODE: Add a new instruction to the current program \n"
				+ "  RESET: Delete the current program \n"
				+ "  REPLACE N: Replace insruction no. N with an instruction to be provided");
		
		return true;
	}
	
	public boolean executeQuit() {
		end = true;
		
		System.out.println("Closing the application...");
		
		return end;
	}
	
	public boolean executeNewInst(ByteCode bc) {
		
		boolean success = false;
		
		if (bc != null){
			program.setNextByteCodeInstruction(bc);
			success=true;
		}
		return success;
	}
	
	public boolean executeRun() {

		boolean success=false;
		if(program.getByteCodeProgramLength()==0){
		} else {
			for (int i=0; i<(program.getByteCodeProgramLength()); i++ ){
				cpu.execute(program.getByteCodeInstructionOnPosition(i));
			}
			success=true;
		}
		
		return success;
	}
	
	public boolean executeReplace(int replace) {
		boolean success = false;
		String rawInput;
		
		if (replace>=0 && replace <program.getByteCodeProgramLength()){
			System.out.print("Please enter replacement instruction: ");
			rawInput = scanner.nextLine();
			ByteCode aux = ByteCodeParser.parse(rawInput);
			if (aux != null){
				program.placeByteCodeInstruction(aux, replace);
				success=true;
			}
		} else 
			System.err.println("Error: \"" + replace + "\" is not a valid position.");
		
		
		return success;
	}
	
	public boolean executeReset() {
		program = new ByteCodeProgram();
		cpu = new CPU();
		return true;
	}
	
}
