import java.util.*;

class Assig4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);ls 
		System.out.println("Enter a String");
		String str = new String(sc.nextLine());
		System.out.println("String: " + str);
		
		String strRev  = new String();
		for(int i=0; i<str.length(); i++){
			strRev = str.charAt(i) + strRev;
		}
		System.out.println(strRev);
	}
}