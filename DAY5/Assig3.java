import java.util.*;

class Assig3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			for(int k=0; k<4-i; k++){
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++){
				System.out.print(i+1 + " ");
			}
			System.out.println();
		}
		
	}
}