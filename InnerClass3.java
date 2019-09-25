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


class InnerClass3{
    public static void main(String args[] )
    {
        Popcorn popcorn=new Popcorn(){
		public void flavor(){
		System.out.println("Sweet");
		}
		};
		popcorn.flavor();
	  
    }
}