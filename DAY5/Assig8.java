import java.util.*;

class Assig8{

	int[] getArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int m = sc.nextInt();
		int[] arr = new int[m];
		System.out.println("Enter the values for Array: ");
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	boolean checkDup(int[] arr, int value){
		boolean isPresent = true;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == value){
				isPresent = false;
				break;
			}
		}
		return isPresent;
	}

	int countDuplicates(int[] arr){
		int count = 0;
		int[] dup = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			int eachDuplicate = -1;
			for(int j=0; j<arr.length; j++){
				if(arr[i] == arr[j] && checkDup(dup, arr[i])){
					eachDuplicate += 1;
				}
			}
			if(eachDuplicate > 0){
				dup[i] = arr[i];
				count += eachDuplicate;
			}
			System.out.println("duplicates of " + arr[i] + " : " + eachDuplicate);
			
		}
		System.out.println("Duplicates: ");
		printArray(dup);
		System.out.println("Number of Dup: " + count);
		return count;
	}

	void getUnique(int[] arr){
		int totalDuplicates = countDuplicates(arr);
		int[] uniqueArray = new int[arr.length-totalDuplicates];
		
		for(int i=0; i<uniqueArray.length; i++){
			for(int j=0; j<arr.length; j++){
				if(checkDup(uniqueArray, arr[j])){
					uniqueArray[i] = arr[j];
					// System.out.println((i) + " : " + arr[j]);
					break;
				}
			}
		}
		
		System.out.println("Unique Array: ");
		printArray(uniqueArray);
		
	}
	
	public static void main(String[] args){
		Assig8 obj = new Assig8();
		int[] arr = obj.getArray();
		
		obj.printArray(arr);

		obj.getUnique(arr);
	}
}