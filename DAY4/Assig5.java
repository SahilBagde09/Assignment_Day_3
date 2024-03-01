import java.util.Scanner;

class Assig5{
	//Array to maintain m,n value for Matrix1 and Matrix2
	int[][] matRowCol = new int[2][2];
	//Counter for current input Matrix to set values in (matRowCol) 2d array
	int currentMatCount = 0;
	
	//Method to Create Array based on user input
	int[][] getMatrix(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of m: ");
		int m = sc.nextInt();
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		matRowCol[currentMatCount][0] = m;
		matRowCol[currentMatCount][1] = n;
		
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++){
			System.out.println("Enter the value for Row:" + (i+1));
			for(int j=0; j<n; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		currentMatCount += 1;
		return arr;
		
	}

	//Method to Print Matrix
	void printMatrix(int[][] arr){
		for(int i=0; i < arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	//Method to Compare 2 Matrix
	void compareMatrix(int[][] arr1, int[][] arr2){
		//condition for comparing
		if((matRowCol[0][0] == matRowCol[1][0]) && (matRowCol[0][1] == matRowCol[1][1])){
			int flag = 0;
			for(int i=0; i < arr1.length; i++){
				for(int j=0; j < arr1[i].length; j++){
					if(arr1[i][j] != arr2[i][j]){
						flag += 1;
						break;
					}
				}
				if(flag != 0){
					break;
				}
			}
			if(flag == 0){
				System.out.println("Matrix 1 and Matrix 2 are Equal!!");
			}
			else{
				System.out.println("Matrix 1 and Matrix 2 are not Equal!!");
			}
		}
		else{
			System.out.println("Matrix 1 and Matrix 2 are not Equal!!");
		}
	}
	
	public static void main(String[] args){
		Assig5 obj = new Assig5();
		int[][] arr1;
		int[][] arr2;
		System.out.println("Matrix 1: ");
		arr1 = obj.getMatrix();
		System.out.println("Matrix 2: ");
		arr2 = obj.getMatrix();
		System.out.println("Matrix 1: ");
		obj.printMatrix(arr1);
		System.out.println("Matrix 2: ");
		obj.printMatrix(arr2);
		
		// For iteration through matRowCol array
		/*System.out.println("matRowCol: ");	
		for(int i=0; i<obj.matRowCol.length; i++){
			for(int j=0; j<obj.matRowCol[i].length; j++){
				System.out.print(obj.matRowCol[i][j] + " ");
			}
			System.out.println();
		}*/
		//System.out.println("Curr count: " + obj.currentMatCount);
		
		//Matrix 1 and Matrix 2 Comparison
		obj.compareMatrix(arr1, arr2);
	}
}