
public class Runway extends Thread{
   synchronized void land(String name){
    try{
			
            System.out.println(name+" is land");
			System.out.println(this.getName()+" is Occupied");
			Thread.sleep(1000);
			System.out.println("Return Flight");
			Thread.sleep(1000);
			
       }catch(Exception e){
       
    }
}
}

