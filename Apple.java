package exercise4_2;

public class Apple extends Fruit{
	private int quantity; 
	private double price;

		
		public Apple (String name, int quantity, double price) {
			super(name,price);
			this.quantity = quantity;
		
		}
		
		public int getQuantity() {
			return this.quantity;
		}
		public double getPrice() {
			return this.price;
		}
		public String price(int quantity, double price) {
			return String.format ("Total Price : RM %.2f" + (price * quantity));
		}
		
		public String toString() {
			return "Total price of apples: ";
		}
}
