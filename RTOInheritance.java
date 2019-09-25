class RTO
{
    public void toStart()
    {
        System.out.println("Start using Kick");
    }
}

class TwoVeh extends RTO
{
    public void display()
    {
        System.out.println("Inside TwoVeh");
    }
}

class Activa extends TwoVeh
{
    public void toStart()
    {
        System.out.println("Kick+Start");
    }
}

class Scooty extends TwoVeh
{
    
}

class RTOInheritance
{
    public static void main(String args[])
    {
       Activa activa=new Activa();
       Scooty scooty=new Scooty();
       activa.toStart();
       scooty.toStart();
    }
}