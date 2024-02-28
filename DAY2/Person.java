class Person{
	int age;
	float height;
	float weight;
	
	Person(){
		age = 34;	
		height = 156.67f;
		weight = 45.34f;		
	}
	
	Person(int a, float h, float w){
		age = a;	
		height = h;
		weight = w;             
	}
	
	void display(){
		System.out.println("Age: " + age);
		System.out.println("Height: " + height + " cm.");
		System.out.println("Weight: " + weight + " Kg.");
	}

	public static void main(String args[]){
		Person p1 = new Person();
		// System.out.println(p1); 
		p1.display();                 
		p1 = new Person(22, 172.4f, 61.4f);
		p1.display();
		// System.out.println(p1); 
		System.out.println("---------------------------");
		Person p2 = new Person();
		p2.display();
		p2 = new Person(36, 166.67f, 54.4f);
		p2.display();
		
		
		
		
		
	}
}