import java.util.*;

class Assig6{

	
	int[] getArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int m = sc.nextInt();
		int[] arr = new int[m];
		System.out.println("Enter the value for array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	void printArray(int[] arr){
		for(int i=0; i< arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	void reverseArray(int[] arr){
		for(int i=0; i<(arr.length/2); i++){
			arr[i] = arr[i] + arr[arr.length-i-1];
			arr[arr.length-i-1] = arr[i] - arr[arr.length-i-1];
			arr[i] = arr[i] - arr[arr.length-i-1];
		}
		System.out.println("Reverse array: ");
		printArray(arr);
	}

	public static void main(String[] args){
		Assig6 obj = new Assig6();
		int[] arr = obj.getArray();
		obj.printArray(arr);
		obj.reverseArray(arr);
		
	}
	
}