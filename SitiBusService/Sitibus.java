

public class Sitibus{
   public static void main(String args[]){
		BusDao busdao=new BusDaoImpl();
		
		for(BusData busdata : busdao.getAllBus()){
			System.out.println("Bus Unique Number:"+busdata.getUnumber()+" "+busdata.getSource()+" "+busdata.getDestination());
		}
		
		BusData busdata=busdao.getAllBus().get(1);
		busdata.setUnumber(4);
		busdata.setSource("Gotri");
		busdata.setDestination("Sevasi");
		busdao.saveBus(busdata);
		//busdao.getBusByUNumber(1);
		
		busdata=busdao.getBusByUniqueNumber(3);
		System.out.println("Soutrce:"+busdata.getSource()+" Destination:"+busdata.getDestination()+" Time:"+busdata.getTime());
		
   }
}

