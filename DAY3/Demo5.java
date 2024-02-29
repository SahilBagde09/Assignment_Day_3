class Demo5{
	public static void main(String args[]){
		int i = 10;
		while(i>5){
			i--;
			if (i == 8){
				continue;
			}
			System.out.println(i);
		}
	}
}