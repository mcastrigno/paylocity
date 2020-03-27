package paylocity; 

import java.util.Scanner;


public class PayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//while loop to take in commands
		//when you get a valid command execute
		//then return with menu
		Scanner scan = new Scanner(System.in);
		String command = "";
		System.out.println("Welcome to the Paylocity PayApp");
		printHelp();
		
		//while loop scans the command line until use exits
		while(scan.hasNext()) {
			try {
				command = scan.nextLine();
				
				switch(command) {
					case "adde":	
									Commands.adde();
									break;
					case "list":	
									Commands.list();
									break;
					case "week":
									Commands.week();
									break;
					case "annual":	
									Commands.annual();
									break;
					case "help":	
									printHelp();
									break;
					case "quit":	
									System.out.println("Thank you for using PayApp! Be sure to like us on Facebook! :)");
									scan.close();
									System.exit(0);				
									break;

					default:						
									printError();
				}
				
				
				System.out.println("Enter a command or type help for a list of commands: ");
				
				
			}catch(java.util.InputMismatchException e) {
				printError();
			}
		}
		

	}
	
	protected static void printError() {
		System.out.println("Sorry, I don't understand your request.");
		System.out.println("Here are the things I know how to do:");
		printMenu();
		
	}
	protected static void printMenu() {
		System.out.println("\"adde\" - add an employee");
		System.out.println("\"list\" - list all employee records");
		System.out.println("\"week\" - show bi-weekly benefit and salary costs");
		System.out.println("\"annual\" - show annual benefit and salary costs");
		System.out.println("\"help\" - see available commands");
		System.out.println("\"quit\" - exit the program");
		
	}
	/*
	 * printHelp is separate from printMenu to allow for adding arguments later for context sensitive help
	 */
	protected static void printHelp() {
		System.out.println("The available case sensitive commands are:");
		printMenu();
	}
}
