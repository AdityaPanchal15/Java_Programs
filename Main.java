abstract class Student
{
  public void getStudent(){
    System.out.println("Student Class");
  }
}

class UgStudent extends Student
{
	public void getUgStudent()
	{
  	 System.out.println("UgStudent");
	}
}

class PgStudent extends Student
{
	public void getUgStudent(){
	 System.out.println("PgStudent");
	}
	
}

class Grade extends Student
{
	Student student;
	public Grade(Student student)
	{
		this.student=student;
	}
	public void calcGrade()
	{
		//System.out.println(student.getClass());
		UgStudent ugStudent=(UgStudent)student;
		ugStudent.getUgStudent();
		ugStudent.getStudent();
	}
}
public class Main{
    public static void main(String args[])
	{
		Student ugStudent=new UgStudent();
		//ugStudent.getUgStudent();
		Grade grade=new Grade(ugStudent);
		grade.calcGrade();
        		
	}
}