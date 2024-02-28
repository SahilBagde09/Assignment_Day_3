class Fact{
	public static void main(String arg[]){
		int fact = 1;
		int number = 5;
		for(int i=number;i>0;i--){
			fact *=i;
		}
		System.out.println(fact);	            
	}
}