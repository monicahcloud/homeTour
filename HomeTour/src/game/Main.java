package game;

import fixtures.Room;
import fixtures.Fixture;
import java.util.Scanner;

public class Main {
	
	static Scanner collectInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome Home!");
		
		
		//boolean variable to keep playing until the conditions are met for the game to stop
		boolean touring = true;
	
		GAME:
			while(touring) {
				System.out.println("***********************************");
				System.out.println("Would you like to take a tour?\n\nIf so, answer yes.");
				String answer = collectInput.next();
				
				if (answer.equals("yes")) {
				System.out.println("You are in the " + " room.");
				System.out.println("Which room would you like to enter?");
			
			}			
				else if (answer.equals("no")) {
					touring = false;
				
				System.out.println("See ya next time!");
			
				}
			}
	}
	}//end of main method
	
//private static void printRoom(Player player) {
//	
//}

//
//private static String[] collectInput() {
//	
//
//}
//
//
// public static Scanner getCollectInput() {
//	return this.collectInput = collectInput;
//}
//
// 
//public static void setCollectInput(Scanner collectInput) {
//	Main.collectInput = collectInput;

//
//private static void parse(String[] command, Player player) {
//	
//	
 

//end of main class
