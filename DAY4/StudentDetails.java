import java.util.Scanner;
class Student{
	private int rollNo;
	float marks;

	Student(){
		rollNo = 0;
		marks = 0.0f;
	}

	Student(int rollNo, float marks){
		this.rollNo = rollNo;
		this.marks = marks;
	}
	protected void getStudentDetails(){
		System.out.println("Rollno: " + rollNo + " , " + "Marks: " + marks);
	}
}

class StudentDetails{
	public static void main(String args[]){
		//Student obj = new Student();
		//Student obj2 = new Student(1, 87.7f);
		//obj2.getStudentDetails();
		Scanner sc = new Scanner(System.in);
		//String str1 = sc.next();
		//String str2 = sc.nextLine();

		//System.out.println("str1: " + str1);
		//System.out.println("str2: " + str2);
		//System.out.println("str2: " + str2);

		for(int i=0; i<=5; i++){
			System.out.println(args[i]);
		}
	}
}