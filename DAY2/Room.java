class Room{
	int height;
	int width;
	int breadth;

	void getVolume(int h, int w, int b){
		height = h;
		width = w;
		breadth = b;
		System.out.println(height*width*breadth);
	}

	public static void main(String args[]){
		Room Room = new Room();
		Room.getVolume(5,41,55);
	}
}                     