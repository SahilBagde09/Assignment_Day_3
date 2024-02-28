class Box{
	float height;
	float width;;
	float breadth;
	
	Box(float h, float w, float b){
		height = h;
		width = w;
		breadth = b;
	}

	void getVolume(){
		float volume = height*width*breadth;
		System.out.println("Volume of Box: " + volume);
	}

	void getArea(){
		float area = 2*(height*width + width*breadth + breadth*height);
		System.out.println("Surface Area of Box: " + area);
	}

	public static void main(String args[]){
		Box box1 = new Box(2.3f,3.0f,4.5f);
		Box box2 = new Box(3.0f, 1.9f,2.7f);
		box1.getVolume();
		box1.getArea();
		box2.getVolume();
		box2.getArea();
	}
}