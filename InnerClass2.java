class InnerClass2
{
   public static void main(String args[])
   {
       Outter outter=new Outter();
       Outter.Inner inner=outter.new Inner();
        inner.m2();
   }
}

class Outter
{
    public void Outter()
    {
        System.out.println("Outter");
    }
    public void m1()
    {
      System.out.println("Method m1");
    }
    class Inner
    {
         public void Inner()
         {
         System.out.println("Inner");
         }
         public void m2()
         {
             System.out.println("Method m2");
         }
    }
}