class InnerClass1
{
   public static void main(String args[])
   {
       Outter outter=new Outter();
       Outter.Inner inner=outter.new Inner();
       inner.m1();
   }
}

class Outter
{
    Outter()
    {
        System.out.println("Outter");
    }
    class Inner
    {
        Inner()
         {
        System.out.println("Inner");
         }
        public void m1(){
          System.out.println("m1 Method");
         }
    }
}