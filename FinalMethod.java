class B
{
    final public void display()
    {
        System.out.println("In Single class");
    }
}

class A extends B
{
    public void display1()
    {
        System.out.println("In A class");
    }
}

class FinalMethod
{
    public static void main(String args[])
    {
      A a=new A();
      a.display();
      
    }
}