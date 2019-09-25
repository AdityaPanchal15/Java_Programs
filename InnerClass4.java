class InnerClass4
{
   public static void main(String args[])
   {
       //Outter outter=new Outter();
       Outter.Inner inner=new Outter.Inner();
       
        inner.m2();
   }
}

class Outter
{
    
    public void m1()
    {
      System.out.println("Method m1");
    }
    static class Inner
    {
        
         public void m2()
         {
             System.out.println("Method m2");
         }
    }
}