import java.util.*;
class Assig1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			for(int j=1; j<=i+1; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}