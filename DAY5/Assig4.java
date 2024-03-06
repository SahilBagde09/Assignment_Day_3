import java.util.*;

class Assig4{

	int[] getArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the values of array: ");
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	void getArraySum(int[] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		System.out.println("Sum of array: " + sum);
	}

	public static void main(String[] args){
		Assig4 obj = new Assig4();
		int[] arr1 = obj.getArray();

		obj.getArraySum(arr1);
	}
}