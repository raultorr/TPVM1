import java.util.*;

public class Engine {

		private ByteCodeProgram program;
		private boolean end=false;
	
		public void start() {
			System.out.println("Type a command: ");					
			Scanner scanner = new Scanner(System.in);
			while(!end){
				String rawInput = scanner.nextLine();
				Command command;
				command = CommandParser.parse(rawInput);
				if (command.equals(null)){
					System.err.println("Error: incorrect command");
				} else if(command.execute(this)==false){
					System.err.println("Error: incorrect execution of command");
				}
			}
			
			scanner.close();
		}
		 //METODOS PARA EJECUTAR COMANDOS
		
}
