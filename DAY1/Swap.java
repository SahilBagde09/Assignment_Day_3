class Swap{
	public static void main(String arg[]){
		int a = 34;
		int b = 56;
		System.out.println(a);
		System.out.println(b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}
}