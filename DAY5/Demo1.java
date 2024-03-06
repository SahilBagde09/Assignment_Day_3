// Jagged Array

import java.util.*;
class Demo1{

	//Method to Create jagged Array
	int[][] getMatrix(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of m (Number of Rows): ");
		int m = sc.nextInt();
		int[][] arr = new int[m][];

		//Getting Sizes of subarray through user input
		for(int i=0; i<m; i++){
			System.out.println("Enter the Size for SubArray: "+ (i+1));
			int size = sc.nextInt();
			arr[i] = new int[size];
		}

		//Insertion of values in the Jagged Array/matrix through user
		System.out.println("Enter value for your Matrix");
		for(int i=0; i<arr.length; i++){
			System.out.println("Enter the value for row: "+ (i+1) + " (" + arr[i].length + " values req)");
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
		
	}

	//Method to just print Jagged Array/Matrix
	void printMatrix(int[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		Demo1 obj = new Demo1();
		int[][] arr1;

		//Calling getMatrix Method
		arr1 = obj.getMatrix();

		//Calling printMatrix Method
		obj.printMatrix(arr1);
		
	}
}