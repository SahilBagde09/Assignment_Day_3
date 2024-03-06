import java.util.*;

class Assig2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i; j++){
				System.out.print(n-j + " ");	
			}
			System.out.println();
		}

	}
}