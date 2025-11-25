//Written by Christopher Lopez

public class Vehicle {

	private String Manufacturer;
	private int Cylinder;
	private String Owner;
	
	public Vehicle(){
		this.Manufacturer ="none";
		this.Cylinder = 6;
		this.Owner = "none";
	}
	
	public Vehicle(String Manufacturer, int Cylinder, String Owner){
		setManufacturer(Manufacturer);
		setCylinder(Cylinder);
		setOwner(Owner);
	}
	
	public void setManufacturer(String Manufacturer) {
		if(Manufacturer != null) {
			this.Manufacturer = Manufacturer;
		}
		else {
			this.Manufacturer = "none";
		}
	}
	String getManufacturer() {
		return this.Manufacturer;
	}
	
	public void setCylinder(int Cylinder) {
		if(Cylinder < 1) {
			this.Cylinder = 6;
		}
		else {
			this.Cylinder = Cylinder;
		}
	}
	
	int getCylinder() {
		return this.Cylinder;
	}
	
	public void setOwner(String Owner) {
		if(Owner != null) {
			this.Owner = Owner;
		}
		else {
			this.Owner = "none";
		}
	}
	
	String getOwner() {
		return this.Owner;
	}
	
	public String toString() {
		String description = "Manufacturer name: " + getManufacturer() +"\nNumber of Cylinders: " + getCylinder() +"\nOwner's name: "+ getOwner();
		return description;
	}
	
	public boolean equals(Vehicle a) {
		return a !=null &&
				this.Manufacturer.equalsIgnoreCase(a.getManufacturer()) &&
				this.Cylinder == a.getCylinder() &&
				this.Owner.equalsIgnoreCase(a.getOwner());
				
	}
	
	
}
