class Data{
	private static int total_employee;
	private int emp_id;
    private String first_name;
    private String last_name;
    private int emp_salary;
	private int age;
	private String post;
	private int daysa;
	private int day[];
	//private int hoursa[];
	
	static public int getTotalEmployee(){
		return total_employee;
	}
	
	public int getEmpId(){
		return emp_id;
	}
	
	public void setEmpId(int emp_id){
		total_employee++;
		this.emp_id=emp_id;
	}
	
	public String getFirstName(){
		return first_name;
	}
	
	public void setFirstName(String first_name){
		this.first_name=first_name;
	}
	
	public String getLastName(){
		return last_name;
	}
	
	public void setLastName(String last_name){
		this.last_name=last_name;
	}
	
	public int getEmpSalary(){
		return emp_salary;
	}
	
	public void setEmpSalary(int emp_salary){
		this.emp_salary=emp_salary;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public String getPost(){
		return post;
	}
	
	public void setPost(String post){
		this.post=post;
	}
	
	public int getDaysa(){
		return daysa;
	}

	public void setDaysa(int daysa){
		this.daysa=daysa;
	}
	
	public int[] getDays(){
	return day;
	}
	
	public void setDays(int[] day){
	this.day=day;
	}

	public String toString(){
		return emp_id+"-"+first_name+"-"+last_name+"-"+emp_salary+"-"+age+"-"+post+"-"+daysa;
	}
}

class Employee{
	public static void main(String[] args){
		Data e=new Data();

		int arr[]=new int[100];
		e.setEmpId(1);
		e.setFirstName("Aditya");
		e.setLastName("Panchal");
		e.setEmpSalary(1000);
		e.setAge(20);
		e.setPost("Programmer");
		e.setDaysa(10);
	    e.setDays(new int[] {0,1,1,1,0,1,1,1,1,1});
		EmployeeManagement a= new EmployeeManagement(e);
	
		a.getData();
		System.out.println("your "+ e.getDaysa() +" days salary is "+a.calcSalary());
		System.out.println("Total Employees in Company:"+Data.getTotalEmployee());
		
	}
}

class EmployeeManagement{
	Data data=new Data();
	public int fulldays=100;
	public int halfdays=40;
	public int sum=0;
	
	public EmployeeManagement(Data data){
		this.data=data;
	}
	public void getData(){
	   System.out.println(data.toString());
	}
	
	public int calcSalary(){
       for(int x:data.getDays()){
	      if(x==0){
		  sum=sum+halfdays;
		  }
		  else{
		  sum=sum+fulldays;
		  }
	   }
	   return sum;
	}
}