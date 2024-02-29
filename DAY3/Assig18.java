import java.util.Scanner;

class Assig18{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Simple Calculator");
		System.out.println("-------------------");
		System.out.println("Enetr first number:");
		int num1 = sc.nextInt();
		System.out.println("Enetr Second number:");
		int num2 = sc.nextInt();

		System.out.println("Choose an operation:");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		int result=0;
		char oper;
		switch(choice){
			case 1:
				result = num1 + num2;
				oper = '+';
				break;
			case 2:
				result = num1 - num2;
				oper = '-';
				break;
			case 3:
				result = num1 * num2;
				oper = '*';
				break;
			case 4:
				result = num1 / num2;
				oper = '/';
				break;
			default:
				System.out.println("Invalid Choice");
				oper = ' ';
				break;
		}
		if(oper != ' '){
			System.out.println("Result: "+ num1 +" " +oper+" " +num2+ " = " + result);
		}		
		
	}
}