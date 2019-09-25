
public class Airplane implements Runnable{
   
   Runway runway;
   String name;

   Airplane(Runway runway,String name){
        this.runway=runway;
		
		this.name=name;
        run();
   }

   @Override
   public void run(){
	  runway.land(name);
   }
}

