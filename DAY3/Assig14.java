import java.util.Scanner;
class Assig14{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you to get factorial");
		int input = sc.nextInt();
		int fact = 1;
		while(input>=1){
			fact *= input;
			input--;
		}
		System.out.println("Factoral: " + fact);
	}
}