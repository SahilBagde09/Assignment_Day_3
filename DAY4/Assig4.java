import java.util.Scanner;

class Assig4{
	int m;
	int n;

	Assig4(int m, int n){
		this.m = m;
		this.n = n;
	}

	//Method to Create Matrix based on user input
	int[][] getMatrix(){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++){
			System.out.println("Enter the values for row" + (i+1));
			for(int j=0; j<n; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

	//Method to print Matrix
	void printMatrix(int[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	//Matrix to Get Addition of 2 Matrix
	int[][] getMatrixSum(int[][] arr1, int[][] arr2){
		int[][] sum = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return sum;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m (No. of rows): ");
		int m = sc.nextInt();
		System.out.println("Enter n (No. of columns): ");
		int n = sc.nextInt();

		//Giving value of m and n to instance variable to make it accessible throughout the class
		Assig4 obj = new Assig4(m, n);

		int[][] arr1;
		int[][] arr2;
		System.out.println("Enter the value for martix: 1" );
		arr1 = obj.getMatrix();
		System.out.println("Enter the value for martix: 2" );
		arr2 = obj.getMatrix();
		
		//Printig both Matrix 1 and Matrix 2
		System.out.println("Matrix 1:");
		obj.printMatrix(arr1);

		System.out.println("Matrix 2:");
		obj.printMatrix(arr2);
		
		//Getting sum of Matrix 1 and Matrix 2 and there Sum
		System.out.println("Sum of Matrix 1 and Matrix 2: ");
		int[][] sum = obj.getMatrixSum(arr1, arr2); 
		obj.printMatrix(sum);
	}
}