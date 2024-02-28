class Student{
	String name;
	int totalMarks;
	
	void setStudentDetails(String n, int t){
		name = n;
		totalMarks = t;
	}

	void getAvgMarks(){
		float average = totalMarks/3;
		System.out.println("Average Marks Obtained: " + average);
	}

	void getStudentDetails(){
		System.out.println("Student's Name: " + name);
		System.out.println("Student's Total Marks Ontained: " + totalMarks);
	}

	public static void main(String args[]){
		Student stud = new Student();
		stud.setStudentDetails("Sahil", 273);
		stud.getAvgMarks();
		stud.getStudentDetails();
	}                                                                               
}                    