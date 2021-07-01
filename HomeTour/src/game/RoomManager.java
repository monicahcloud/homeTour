package game;

import fixtures.Room;

public class RoomManager {
	private Room[] condo = new Room[5];
	private Room startingRoom;
	
	public void init () {
		Room foyer = new Room("The Foyer" + "\n",  
				"a long, wide walkway", "\n"
	+"The main entryway into a grand room"+ "\n" 
	+ "The kitchen is open to the west, where a large island separates the kitchen from the living room." + "\n"
	+ "The hardwood floor expands the length of the entire area including the kitchen and living room." + "\n" 
	+ " To the north is the only bathroom in the condo. " );
		
		Room livingRoom = new Room("Living Room" + "\n", 
				"Large Living Room ",
				"The Living Room  with marble fireplace used for entertaining friends, talking, reading or watching TV" + "\n"
				+ "The hardwood floor leads west into the kitchen"
				+  "To the north is the only bathroom in the home and bedroom2");
		Room kitchen = new Room("Kitchen", "Gourmet Kitchen.",  "The hardwood floor extends into this gourmet kitchen w/breakfast area w/tons of cabinet space." );
		Room bathroom = new Room("Bathroom", "Large, beautiful bathroom", "This supersized, elegant bathroom is a dream for anyone." + 
		"\nIt is a Jack and Jill style bathroom with doors leading to both bedrooms. It has two separate vanities next to the corresponding door. The toilet is in its own closet. The shower is a walkin shower and it also has a claw foot table. ");
		Room master = new Room("The Master Bedroom", "The Master Bedroom ",  " Huge master suite w/sitting area, and walk in closet ");
		
		this.startingRoom = foyer;
		
		//create floorplan of Condo Array 
		this.condo[0] = foyer;
		this.condo[1] = livingRoom;
		this.condo[2] = kitchen;
		this.condo[3] = bathroom;
		this.condo[4] = master;
		
		//set up the exits from each room to the others
		foyer.setExits(master, null, livingRoom, kitchen); 
		livingRoom.setExits(bathroom, null, null, foyer);
		kitchen.setExits(master, null, livingRoom, null);
		bathroom.setExits(null, livingRoom, null, master);
		master.setExits(null, kitchen, bathroom, null);
				
	}//end of init method

	public Room[] getCondo() {
		return condo;
	}

	public void setCondo(Room[] condo) {
		this.condo = condo;
	}

	public Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
}//end of RoomManager class
