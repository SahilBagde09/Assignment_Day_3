class TestNew{
	static int a;
	float b;
	char c;
	static int varStatic = 100;
	
	void addTwoNumber(int a1, int b1){
		int sum = a1 + b1;
		System.out.println(sum);
	}
	
	static void addTwoNumber(int a1){
		int sum = a1 + a;
		System.out.println(sum);
	}

	public static void main(String arg[]){
		TestNew obj2 = new TestNew(23,34.5f,'h');		
		TestNew obj1 = new TestNew();
		
		//int a;
		System.out.println(obj1.a + " int a");
		System.out.println(obj1.b + " float b");
		System.out.println(obj1.c + " char c");
		System.out.println("------------------");
		System.out.println(obj2.a + " int a");
		System.out.println(obj2.b + " float b");
		System.out.println(obj2.c + " char c");
		System.out.println(obj2.varStatic);
		varStatic = 200;
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("------------------");
		addTwoNumber(2);
		obj2.addTwoNumber(200,3);

	}
	TestNew(){
		a = 100;
		b = 230.4f;
		c = 'f'; 
	}
	
	TestNew(int a1, float b1, char c1){
		a = a1;
		b = b1;
		c = c1;
	}
}