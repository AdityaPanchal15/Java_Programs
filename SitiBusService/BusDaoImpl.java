import java.util.*;
import java.time.*;

interface BusDao{
   List<BusData> getAllBus();
   BusData getBusByUniqueNumber(int unumber);
   //void getBusByUNumber(int unumber);
   void saveBus(BusData busdata);
   void deleteBus(BusData busdata);
}


public class BusDaoImpl implements BusDao{
	private List<BusData> busdata;
	private LocalTime localtime;
	int j=0;
	
	public BusDaoImpl(){
		busdata=new ArrayList<>();
		//for(int i=0;i<10;i++){
		localtime=LocalTime.of(7,j);
		busdata.add(new BusData(1,"Station","Gorwa",localtime));
		//j+=30;
		//localtime=LocalTime.of(7,j);
		
		//busdata.add(new BusData(2,"Station","Sama"));
		//busdata.add(new BusData(3,"Station","Manjalpur"));
		//}
	}
	
	public List<BusData> getAllBus(){
		return busdata;
	}
	
	/*public void getBusByUNumber(int unumber){
		for(BusData busdat:getAllBus()){
			if(busdat.getUnumber()==unumber)
			{
			System.out.println("Bus Number:"+busdat.getUnumber()+" "+busdat.getSource()+" "+busdat.getDestination());
			}
			
		}
	}*/
	public BusData getBusByUniqueNumber(int unumber){
		return busdata.get(unumber);
	}
	
	public void saveBus(BusData busdatas){
	    busdata.add(busdatas);
	}
	
	public void deleteBus(BusData busdatas){
		busdata.remove(busdatas);
	}	
}