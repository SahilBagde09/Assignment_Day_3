class Assig1{
	public static void main(String args[]){
		int arr[] = {5, 4, 3, 9, 1, 7, 9};
		double sum = 0.0;
		int arrSize = arr.length;
		for(int i=0; i<arrSize; i++){
			sum += arr[i];
			//System.out.println(arr[i]);
		}
		//System.out.println(sum);
		double average = sum/arrSize;
		System.out.println("Average: " + average);
	}
}