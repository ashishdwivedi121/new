package jquery.datatables.model;

public class Company {
	
	static int nextID = 17;

    public Company(String tower,String name, String event, String address, String town,String startdate,String enddate)
    {
        id = nextID++;
        this.tower = tower;
        
        this.name = name;
        
        this.event = event;
        
        this.address = address;
        this.town = town;
        this.enddate = enddate;
        this.startdate = startdate;
       
    }
      
    private int id;
    
    

	private String  tower;
    private String name;
    public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	private String event;
    private String address;
    private String town;
    private String enddate;
    private String startdate;
    
    public String getTower() {
		return tower;
	}
	public void setTower(String tower) {
		this.tower = tower;
	}

	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
}
