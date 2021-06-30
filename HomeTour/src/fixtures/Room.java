package fixtures;

public class Room extends Fixture {
	
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
	
	//Add the setup for the exits
	public void setExits(Room northExit, Room southExit, Room eastExit, Room westExit) {
		this.exits[0] = northExit;
		this.exits[1] = southExit;
		this.exits[2] = eastExit;
		this.exits[3] = westExit;
		
	}
	
	public Room getExit(String direction) {
		
		//Add the return statements for the other directions
		
		if(direction.equals("north")) {
			return exits[0];
		}else if (direction.equals("south")) {
			return exits[1];
		}else if (direction.equals("east")) {
			return exits[2];
		}else if (direction.equals("west")) {
			return exits[3];
		}
		else return null;
	}
	
}//end of Room class
