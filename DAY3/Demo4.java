class Demo4{
	int a; 
	
	Demo4(){
		a = 10;
	}
	Demo4(int a1){
		a = a1;
	}
	void setValue(int b1){
		a = b1;
	}

	public static void main(String arg[]){
		Demo4 obj = new Demo4();
		Demo4 obj2 = new Demo4(34);
		System.out.println(obj2.a);
		obj2.setValue(54);
		System.out.println(obj2.a);
	}	
}