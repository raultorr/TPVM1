import java.util.*;

public class Engine {

		private ByteCodeProgram program;
		private boolean end = false;
	
		public void start() {
			Scanner scanner = new Scanner(System.in);
			String rawInput;
			Command command; 
			
			System.out.print(">");					
			while(!end){
				rawInput = scanner.nextLine();
				command = CommandParser.parse(rawInput);
				if (command.equals(null)){
					System.err.println("Error: incorrect command");
				} else if(command.execute(this) == false){
					System.err.println("Error: incorrect execution of command");
				}
			}
			scanner.close();
		}
		 //METODOS PARA EJECUTAR COMANDOS
		
}
