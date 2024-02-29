import java.util.Scanner;
class Assig13{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int i = sc.nextInt();
		for(int j=1; j<=10; j++){
			int value = i*j;
			System.out.println(i + " x " + j + " = " + value);
		}
	}
}