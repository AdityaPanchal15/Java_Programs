
class Student {

    String firstName;
    String lastName;
    String enNumber;
    String  dept;
    int mark1;
    int mark2;
    int mark3;
    float avg;


    String getFirstname(){
        return firstName;
    }
    void setFirstname(String firstName){
        this.firstName = firstName;
    }


    String getLastname(){
        return lastName;
    }
    void setLastname(String lastName){
        this.lastName = lastName;
    }


    String getEnNumber(){
        return enNumber;
    }
    void setEnNumber(String enNumber){
        this.enNumber = enNumber;
    }


    String getDept(){
        return dept;
    }
    void setDept(String dept){
        this.dept = dept;
    }

    void getMarks(){
        System.out.println("mark1: "+ mark1);
        System.out.println("mark2: "+ mark2);
        System.out.println("mark3: "+ mark3);
    }
    void setmarks(int mark1, int mark2,int mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        setAvg();
    }

    void setAvg(){
        avg=(mark1+mark2+mark3)/3;
    }
    
    float getAvg(){
        return avg;
    }


}

class StdMng {
    Student temp = Null;
    StdMng(Student student1){
        this.st1=stt1;
    }
        void studentDisplay(Student student1){

            System.out.println(student1.getFirstname()); 
            System.out.println(student1.getLastname());
            System.out.println(student1.getEnNumber());
            System.out.println(student1.getDept()); 
            System.out.println(student1.getAvg()); 

        }
    
         
}

class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student();

        student1.setFirstname("Thanos");
        student1.setLastname("Galaxy");
        student1.setEnNumber("11AE69");
        student1.setDept("AeroEng");
        student1.setmarks(90,95,85);
        StdMng manage = new StdMng(student1);

        
        
    }
}