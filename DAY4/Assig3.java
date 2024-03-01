import java.util.Scanner;
class Assig3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number n");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<n; i++){
			int t = 2*(i-1);
			if(t%3 == 0){
				System.out.println("t: " + t + " " + "i: " + i);
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
}