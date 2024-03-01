import java.util.Scanner;

class Demo1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		//int a[] = new int[5];
		//System.out.println(a[5]);
		for(int i=0; i<6; i++){
			System.out.println("Enter number: " + (i+1));
			a[i] = sc.nextInt();
		}
		System.out.println("-----New Array-----");
		/*for(int i=0; i<5; i++){
			System.out.println(a[i]);
		}*/
		
		for(int each: a){
			System.out.println(each);
		}

	}
}