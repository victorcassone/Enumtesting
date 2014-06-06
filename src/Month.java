
public enum Month {
	January("So cold"), 
	Febuary("very short"), 
	March("fake paddies"), 
	April("showers and flowers");
	
	private final String description;
	
	Month(String desc){
		this.description = desc;
	}
	
	public String getDesc(){
		return description;
	}
}
