package week1.day1;

public class Student {
	
	public void studentName(String name) {
		System.out.println("Student name:"+name);

	}

	public void rollNo(long rollno) {
		
		System.out.println("Roll no:"+rollno);
	}
	public void collegeName(String name) {
		System.out.println("College name:"+name);
		
	}
	public void marksscored(int marks) {
		
		System.out.println("Marks scored:"+marks);
	}
public void cgpa(float cgpa) {
	
	System.out.println("CGPA:"+cgpa);
}
	public static void main(String[] args) {
		Student s=new Student();
		
		s.studentName("Rajalakshmi");
		s.rollNo(1000001l);
		s.collegeName("SNU");
		s.marksscored(85);
		s.cgpa(8.5f);

	}

}
