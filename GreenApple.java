package exercise4_2;

public class GreenApple extends Apple {
	private String color;
	 private int intake, calories;
	 
	 public GreenApple (String name, int quantity, double price, String color, int intake, int calories) {
		 super(name,quantity,price);
		 this.color=color;
		 this.intake=intake;
		 this.calories=calories;
	 }
	 
	 public String getColor() {
		 return this.color;
	 }
	 
	 public int getIntake() {
		 return this.intake;
	 }
	 
	 public int getCalories() {
		 return this.calories;
	 }
	 
	 public int TotalCalories(int calories,int intake) {
		 return this.calories * this.intake;
	 }
	 
	 public double price() {
		 return super.getPrice();
	 }
	 
	 public String toString() {
		 return "The total Calories for Green Apples are :";
	 }
}
