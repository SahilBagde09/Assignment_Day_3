import java.util.*;

class Assig7{
	int currentArrayCount = 0;
	
	void printArray(int[] arr){
		System.out.println("Array: " + currentArrayCount);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	int[] getArray(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		currentArrayCount++;
		return arr;
	}

	void getCommonElement(int[] arr1, int[] arr2){
		int[] shortArr = arr1;
		int[] longArr = arr2;
		if(shortArr.length > longArr.length){
			shortArr = arr2;
			longArr = arr1;
		}

		for(int i=0; i<shortArr.length; i++){
			for(int j=0; j<longArr.length; j++){
				if(shortArr[i] == longArr[j]){
					System.out.print(shortArr[i] + " ");
					break;
				}
			}
		}
	}	

	public static void main(String[] args){
		Assig7 obj = new Assig7();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st array: ");
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		arr1 = obj.getArray(arr1);
		System.out.println("Enter the size of 2nd array: ");
		int n = sc.nextInt();		
		int[] arr2 = new int[n];
		arr2 = obj.getArray(arr2);
		
		System.out.println("Common Elements in the Array 1 and Array 2 are: ");
		obj.getCommonElement(arr1, arr2);
	}
}