import java.util.Scanner;
class Assig11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a non 0 number");
		int i = sc.nextInt();
		/*for(i = sc.nextInt(); i!= 0; i++){
			System.out.println(i);
			System.out.println("Do you want to contine? Enter 0 to exit");
			i = sc.nextInt();
			if (i == 0){
				break;
			}
		}*/

		while(i != 0){
			System.out.println(i);
			System.out.println("Do you want to contine? Enter 0 to exit");
			i = sc.nextInt();
		}        
	}
} 