abstract class Popcorn
{
	abstract public void flavor();
}

class Meggimasala extends Popcorn
{
	public void flavor(){
	System.out.println("Meggimasala");
	}
}

class CheesePopcorn extends Popcorn
{
	public void flavor(){
	System.out.println("CheesePopcorn");
	}
}


class AbstractClass{
    public static void main(String args[] )
    {
       CheesePopcorn cheese=new CheesePopcorn();
		cheese.flavor();
	  
    }
}