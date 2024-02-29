import java.util.Scanner;

class Assig15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int input = sc.nextInt();
		int sum = 0;
		do{
			sum += input%10;
			//System.out.println(input%10);
			input = input/10;
			//System.out.println(input);
		}while(input >0);
		System.out.println(sum);
	}
}