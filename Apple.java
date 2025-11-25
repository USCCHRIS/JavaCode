//Written by Christopher Lopez
public class Apple {
	
	private String type;
	private double weight;
	private double price;
	
	//Default constructor for apples that do have default values or are set to if they are invalid
	public Apple(){
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	//Parameterized constructors for apple's that do not have invalid or default values
	public Apple(String type, double weight, double price){
		setType(type);
		setWeight(weight);
		setPrice(price);
	}
	
	public void setType(String type) {
		if(!type.equalsIgnoreCase("Gala") 
			&& !type.equalsIgnoreCase("Red Delicious") 
			&& !type.equalsIgnoreCase("Golden Delicious") 
			&& !type.equalsIgnoreCase("Granny Smith")) {
			
			this.type = "Gala";
	}
		else {
			this.type = type;
		}
	}
	String getType() {
		return this.type;
	}
	
	public void setWeight(double weight) {
		if(weight < 0 || weight > 2 ) {
			this.weight = 0.0;
	}
		else {
			this.weight = weight;
		}
	}
	
	double getWeight() {
		return this.weight;
	}
	
	public void setPrice(double price) {
		if(price < 0 ) {
			this.price = 0.0;
		}
		else {
			this.price = price;
		}
	}
	
	String getPrice() {
		return "$" + this.price;
	}
	
	
	//Turns the apple's values into a description so the user knows what the apple's values are
	public String toString() {
		String description = "Type: " + getType() +" Weight: " + getWeight() +" Price: "+ getPrice();
		return description;
	}
	//Checks if the apples are null or not and then compares the values of each type, etc then gives true or false
	public boolean equals(Apple a) {
		return a !=null &&
				this.type.equalsIgnoreCase(a.getType()) &&
				this.weight == a.getWeight() &&
				this.price == a.price;
				
	}
	
}
