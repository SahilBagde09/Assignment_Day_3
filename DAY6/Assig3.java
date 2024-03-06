import java.util.*;

class Assig3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int m = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int n = sc.nextInt();
		int largestNumber = m > n? m : n;
		System.out.println("largest number: " + largestNumber);
	}
}