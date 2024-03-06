import java.util.*;

class Assig5{
	
	//Method to get First Maxium in array.
	int getFirstMax(int[] arr){
		int max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}

	//Method to verify that current element is already in the array.
	/*boolean checkValue(int[] arr, int currnt){
		boolean result = true;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == currnt){
				result =  false;
				break;
			}
		}
		return result;
	}*/

	//Method to display Array.
	void viewArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	//Method to replace the current maximum element in array with 0.
 	int[] getupdated(int[] arr, int val){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == val){
				arr[i] =  0;
				break;
			}
		}
		return arr;

	}

	//Main Method to get the maximum at any postion.(1st, 2nd, 3rd...nth)
	void getCertainMax(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which Maxium you want: ");
		int m = sc.nextInt();
		int currentMax = getFirstMax(arr);
		if(m > arr.length || m <= 0){
			System.out.print("Postion you entered is not within array range " + "(1 to " + (arr.length)+")"); 
		}
		else if(m != 1){
			int max = currentMax;
			arr = getupdated(arr, max);
			//System.out.println("Current "+ max);
			for(int i=1; i<m; i++){
				//System.out.println("before outer arr upd: "+ (i+1));
				//viewArray(arr);
				int arrMax = arr[0];
				for(int j=0; j<arr.length; j++){
					if(arr[j] > arrMax){
						arrMax = arr[j];
					}
				}
				max = arrMax;
				arr = getupdated(arr, max);
				//System.out.println("after outer arr upd: "+ (i+1));
				//viewArray(arr);
			}
			System.out.println(m+ " largest value in array is: " + max);
		}
		else{
			System.out.println(m+ " largest value in array is: " + currentMax);
		}
	}
	
	//Method to create an array based on user input.
	int[] getArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter");
		int m = sc.nextInt();
		int[] arr = new int[m];
		System.out.println("Enter the values of array: ");
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args){
		Assig5 obj = new Assig5();
		int[] arr = obj.getArray();
		obj.getCertainMax(arr);
		
	}
}