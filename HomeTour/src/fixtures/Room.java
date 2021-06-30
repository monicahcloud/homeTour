package fixtures;

public class Room extends Fixture {
	
	String name;
	Room[]exits = new Room[4];
	//{north, south, east, west}
	//{0, 1, 2, 3}
	
	
	public Room(String name, String shortDescription, String longDescription) {
		super (name, shortDescription, longDescription);
		this.exits = new Room[4];
		
	}//end of Room constructor
	
	public Room[] getExits() {
		return exits;
		
	}
	
	public Room getExit(String direction) {
		return null;
		
	}
	
}//end of Room class
