
public class Student {

	String student_name,student_address,student_course;
	
	public Student(String student_name,String student_address , String student_course)
	{
      this.student_name=student_name;
      this.student_address=student_address;
      this.student_course=student_course;
	}
	
	
	public String toString()
	{
		return "Name is : "+student_name+"\nAddress is : "+student_address+"\nCourse is : "+student_course;
	}
	
	public static void main(String str[])
	{
		Student student[]=new Student[5];
		student[0]=new Student("Sandeep","Noida","MCA");
		student[1]=new Student("Sahu","Noida","MCA");
		student[2]=new Student("Rahul","Noida","MCA");
		student[3]=new Student("Amit","Noida","MCA");
		student[4]=new Student("Amit","Noida","MCA");
		System.out.println(student[0]);
		System.out.println(student[1]);
		System.out.println(student[2]);
		System.out.println(student[3]);
		System.out.println(student[4]);
	}
}
