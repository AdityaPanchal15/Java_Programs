class UpCasting
{
    public static void main(String args[])
    {
        UgStudent ugstudent=new UgStudent();
        ugstudent.setDpt("IT");
        
        ugstudent.setName("Aditya");
        ugstudent.setId(1);
        ugstudent.setMarks(new int[] {50,60,70,40,67});

        Grade grade=new Grade(ugstudent);
        grade.calcGrade();

        PgStudent pgstudent=new PgStudent();
        pgstudent.setDpt("IT");
        
        pgstudent.setName("Aditya");
        pgstudent.setId(1);
        pgstudent.setMarks(new int[] {50,60,70,40,67});
        
        Grade grade1=new Grade(pgstudent);
        grade1.calcGrade();
    }
}

class Student{
    private String name;
    private String dpt;
    private int id;

    public String getName(){
       return name;
    }

    public void  setName(String name){
       this.name=name;
    }

    public String getDpt(){
       return dpt;
    }

    public void  setDpt(String dpt){
       this.dpt=dpt;
    }

    public int getId(){
       return id;
    }
    public void  setId(int id){
       this.id=id;
    }

    public String toString()
    {
        return name+"-"+id+"-"+dpt;
    }
}

class UgStudent extends Student{
    int[] marks=new int[5];
    
    public int[] getMarks(){
       return marks;
    }
    public void  setMarks(int[] marks){
       this.marks=marks;
    }

}

class PgStudent extends Student{
    int[] marks=new int[5];
    
    public int[] getMarks(){
       return marks;
    }
    public void  setMarks(int[] marks){
       this.marks=marks;
    }

}

class Grade{
    
    Student student=new Student();

    public Grade(Student student){
        this.student=student;
    }

    public void calcGrade()
    {
        if(student.getClass().getName().equals("UgStudent")){
            
            UgStudent ugstudent=(UgStudent)student;
            int sum=0;
            
            for(int y:ugstudent.getMarks())
            {
            System.out.println(y);
            sum=sum+y;
            }
            System.out.println(sum);

           // System.out.println(ugstudent.getMarks1());
            System.out.println(ugstudent.toString());
        }
        else{
            PgStudent pgstudent=(PgStudent)student;
            
            int sum=0;
            
            for(int y:pgstudent.getMarks())
            {
            System.out.println(y);
            sum=sum+y;
            }
            System.out.println(sum);

           // System.out.println(pgstudent.getMarks());
          
           System.out.println(pgstudent.toString());
            
        }

        
        
    }

}