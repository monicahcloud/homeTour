package game;

import java.util.Scanner;

public class Main {
	
	static Scanner collectInput = new Scanner(System.in);
	static RoomManager roomManager = new RoomManager();
	static Player player = new Player();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome Home!");
		roomManager.init();
		
		player.setCurrentRoom(roomManager.getStartingRoom());
	
			while(true) {
				System.out.println("***********************************");
				printRoom(player);
				System.out.println("\nWhat would you like to do? ");
				String [] userInput = collectInput();
				parse(userInput, player); 
		
			}
	
	}//end of main method
	
private static void printRoom(Player player) {
	
	System.out.println(player.getCurrentRoom().getName());
	System.out.println(player.getCurrentRoom().getLongDescription());
	System.out.println("\n\nExits:\n");
	
	if(player.getCurrentRoom().getExit("north") != null) {
		System.out.println("North: " + player.getCurrentRoom().getExit("north").getShortDescription());
	}
	if(player.getCurrentRoom().getExit("south") != null) {
		System.out.println("South: " + player.getCurrentRoom().getExit("south").getShortDescription());
	}
	if(player.getCurrentRoom().getExit("east") != null) {
		System.out.println("East: " + player.getCurrentRoom().getExit("east").getShortDescription());
	}
	if(player.getCurrentRoom().getExit("west") != null) {
		System.out.println("West: " + player.getCurrentRoom().getExit("west").getShortDescription());
	}
}


private static String[] collectInput() {
	String input = collectInput.nextLine();
	String [] inputArray = input.split(" ");
	return inputArray;

}

private static void parse(String[] command, Player player) {

	if(command[0].equals("quit")) {
		System.out.println("Thanks for playing.");
		System.exit(0);
	}
	
 switch(command[1]) {
 case "north":
	 player.setCurrentRoom(player.getCurrentRoom().getExit("north"));
	 break;
 case "south":
	 player.setCurrentRoom(player.getCurrentRoom().getExit("south"));
	 break;
 case "east":
	 player.setCurrentRoom(player.getCurrentRoom().getExit("east"));
	 break;
 case "west":
	 player.setCurrentRoom(player.getCurrentRoom().getExit("west"));
	 break;
 }
}
}
//end of main class
