class Student{
    private int id;
    private String name;
    private int[] marks;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int[] getMarks(){
        return marks;
    }
    public void setMarks(int marks[]){
        this.marks = marks;
    }
}

class Grade{
    Student student = null;

    public Grade(Student student){
        this.student = student;
    }

    public float calcGrade(){
        float sum = 0;
        for(int i : student.getMarks()){
            System.out.println(i);
            sum = sum + i;
        }
        
        int length = student.getMarks().length;
        float total = length * 100;
        System.out.println("Total "+sum+" Obtain"+total);
        return (sum/total)*100;
    }
}

class StudentMng{
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Aditya");
        student.setMarks(new int[]  {50,90,67,45,66});

        Grade grade = new Grade(student);
        System.out.println(grade.calcGrade());

    }
}

