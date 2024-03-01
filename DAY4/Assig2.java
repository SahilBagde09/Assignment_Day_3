class Assig2{
	public static void main(String args[]){
		int arr[] = {5, 4, 3, 9, 1, 7, 9};
		int max = arr[0];
		int min = arr[0];
		for(int each: arr){
			if(each > max){
				max = each;
			}
			else if (each < min){
				min = each;
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		
	}
}