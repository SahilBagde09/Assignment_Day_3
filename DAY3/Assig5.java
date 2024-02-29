import java.util.Scanner;

class Assig5{
	
	int getNumber(){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

	
	public static void main(String args[]){
		Assig5 obj = new Assig5();
		int i = obj.getNumber();
		while(i<10){
			i++;
			int j = obj.getNumber();
			if(j == 0){
				break;
			}
			else if (j == 1){
				continue;
			}
			System.out.println(i + "," + j );
		}
		System.out.println("finished");
	}
}