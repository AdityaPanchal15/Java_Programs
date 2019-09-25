
public class Airport{
   public static void main(String args[]){
      
	  
       Runway r1=new Runway();
	   Runway r2=new Runway();
	   Runway r3=new Runway();
	   Runway r4=new Runway();
	   r1.setName("Runway1");
	   r2.setName("Runway2");
	   r3.setName("Runway3");
	   r4.setName("Runway4");
	   
       int j=4,k=8,l=12;
	   Airplane a[]=new Airplane[16];
	   
	try{
	 for(int i=1;i<=4;i++){
	  if(r1.isAlive()!=true){
		a[i]=new Airplane(r1,"air"+i);
	  } if(r2.isAlive()!=true){
		  j++;
		a[j]=new Airplane(r2,"air"+j);
	  } if(r3.isAlive()!=true){
		k++;
		a[k]=new Airplane(r3,"air"+k);
	  } if(r4.isAlive()!=true){
		l++;
		a[l]=new Airplane(r4,"air"+l); 
	  }
	 }
	 }catch(Exception e){
		System.out.println(e);
	 }
	
   }
}

