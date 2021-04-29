package exercise4_2;

public class RedApple extends Apple {
	private int weight;
	private String color;
	
	public RedApple(String name, int quantity, double price, int weight, String color) {
		super(name,quantity,price);
		this.weight = weight;
		this.color = color;
	}
	
	
	public int getWeight() {
		return this.weight;
	}

	public String getColor() {
		return this.color;
	}
	
	public double price() {
		return super.getPrice();
	}
	
	public String TotalWeight(int weight, int quantity) {
		return String.format("Total weight of Redapples: %.2f", (weight * super.getQuantity()));
	}
	
	public String toString() {
		return "Red Apples weight ";
	}
}
