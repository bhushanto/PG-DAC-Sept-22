
class Room{
	int height, width, breadth;
	Room(){}
	Room(int height, int width, int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	double volume(){
		return height*width*breadth;
		
	}
}
class RoomDemo{
	public static void main(String[] args){
		Room r = new Room(1,4,7);
		System.out.println("Volume = "+ r.volume());
	}
}