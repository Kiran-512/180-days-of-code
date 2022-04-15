enum Direction{EAST,WEST,SOUTH,NORTH}

enum Color {
	RED,
	GREEN,
	YELLOW;
	
	Color(){
		System.out.println("Constructor invoked");
	}
	
	void printColor(){
		System.out.println(this);
	}
	
	
}
class EnumDemo{
	public static void main(String[] args){
		for(Direction d : Direction.values()){
			System.out.println(d);
		}
		
		Direction d2 = Direction.WEST;
		
		switch(d2){
			case EAST : //;
			case WEST : //;
			
		}
		
		Color c = Color.RED;
		c.printColor();
		
		Color c2 = new Color();
		
	}
}