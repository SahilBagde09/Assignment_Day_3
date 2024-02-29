import java.util.Scanner;

class Assig16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check Prime");
		int number = sc.nextInt();
		int count = 0;
		for(int i=2; i<number; i++){
			if(number%i == 0){
				count ++;
				break;
			}
		}
		if(count == 0){
			System.out.println(number + " is Prime");
		}
		else{
			System.out.println(number + " is not Prime");
		}
	}
}