class Demo{
	int a;
	float b = 20.0f;

	static int var1; 

	Demo(){
		System.out.println("Inside 0 para const");
	}
	
	// init block
	{
		a = 100;
		b = 2000.0f;

		var1 = 5000;
	}

	/* static block
	{
		var1 = 6000;
	}*/

	public static void main(String[] args){
		/*Demo obj = new Demo();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(var1);*/		
		String c = "ab";
		String d = "cd";
		char e = 'a';
		switch(e){
			case 97:
				System.out.println("case ab");
				break;
			case 'b':
				System.out.println("case cd");
				break;
			case 'd':
				System.out.println("case abcd");
				break;
			default:
				System.out.println("case NF");
				break;
		}

	}
}