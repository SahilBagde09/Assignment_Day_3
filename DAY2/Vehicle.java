 class Vehicle{
	float price;
	String color;
	String model;
	
	Vehicle(float p, String c, String m){
		price = p;
		color = c;
		model = m;
	}
	
	void display(){
		System.out.println("Vehicle Price: " + "Rs."+price);
		System.out.println("Vehicle Color: " + color);
		System.out.println("Vehicle Model: " + model);
	}

	public static void main(String args[]){
		Vehicle v1 = new Vehicle(450047.45f, "Red Chrome finish", "RE GT 650");
		v1.display();
	}

}