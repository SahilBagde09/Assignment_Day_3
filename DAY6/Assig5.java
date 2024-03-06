import java.util.*;

class Assig5{

	void isPalindrome(String str){
		String str2 = new String();
		for(int i=0; i<str.length(); i++){
			str2 = str.charAt(i) + str2;
		}
		// System.out.println("Str1: " + str);
		// System.out.println("Str2: " + str2);

		if(str2.equals(str)){
			System.out.println("true");
		} 
		else{
			System.out.println("false");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Assig5 obj = new Assig5();

		System.out.println("Enter a String: ");
		String str = new String(sc.nextLine());

		obj.isPalindrome(str.toLowerCase());
	}
}