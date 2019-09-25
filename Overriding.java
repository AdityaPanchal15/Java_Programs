class B
{
    public void display()
    {
        System.out.println("Parent Class");
    }
}

class A extends B
{
    public void display()
    {
        System.out.println("Child Class");
    }
}

class Overriding
{
    public static void main(String args[])
    {
      A a=new A();
      a.display();
       
    }
}