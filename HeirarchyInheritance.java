class A
{
    public void display1()
    {
        System.out.println("In A class");
    }
}

class B extends A
{
    public void display()
    {
        System.out.println("In B class");
    }
}

class C extends A
{
    public void display2()
    {
        System.out.println("In C class");
    }
}

class HeirarchyInheritance
{
    public static void main(String args[])
    {
        B b=new B();
      C c=new C();
      b.display1();
      c.display1();
    }
}