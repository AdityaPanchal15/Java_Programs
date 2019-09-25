class InnerClassFromOutter
{
   public static void main(String args[])
   {
       Outter outter=new Outter();
       //Outter.Inner inner=new Outter().new Inner();
    outter.m1();
   }
}

class Outter
{
    public void m1()
    {
      System.out.println("Method m1");
    }
    class Inner
    {
         Inner()
         {
             System.out.println("Method m2");
         }
		 
    }
	Inner inner=new Inner();
	
}