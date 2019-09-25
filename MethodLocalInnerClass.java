class MethodLocalInnerClass
{
   public static void main(String args[])
   {
       Outter outter=new Outter();
    outter.m1();
	//Outter.Inner inner=new Outter().new Inner();
   }
}

class Outter
{
    Outter()
    {
      System.out.println("Outter");
    }
    
	public void m1()
	{
	 class Inner
         {
	  Inner(){
             System.out.println("Inner");
	  }
	 }
	 new Inner();
        }

	
}