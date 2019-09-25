import java.time.*;

public class BusData{
    private int unumber;
	private String source;
	private String destination;
	private LocalTime time;
	
	public BusData(){
	}
	
	public BusData(int unumber,String source,String destination,LocalTime time){
		this.unumber=unumber;
		this.source=source;
		this.destination=destination;
		this.time=time;
	}
	
	public void setUnumber(int unumber){
		this.unumber=unumber;
	}
	public void setSource(String source){
		this.source=source;
	}
	public void setDestination(String destination){
		this.destination=destination;
	}
	public void setTime(LocalTime time){
		this.time=time;
	}
	
	
	public int getUnumber(){
		return unumber;
	}
	public String getSource(){
		return source;
	}
	public String getDestination(){
		return destination;
	}
	public LocalTime getTime(){
		return time;
	}
}