package exercise4_2;
public class main {

	public static void main(String[] args) {

		Apple objapple = new Apple ("Apple", 3, 0.90);
		RedApple objredapple = new RedApple("Honeycrisp", 2, 1.50, 30,"RED");
		GreenApple objgreenapple = new GreenApple ("Crispin", 3, 1.45,"GREEN",98,20);
		
		System.out.println();
		
		System.out.println("-APPLE-");
		System.out.printf("The Price of Apples are : RM" + objapple.price(2,0.95));
		System.out.println(objapple.toString());
		System.out.println();
		
		System.out.println("-REDAPPLE-");
		System.out.printf("Total Price : RM" + objredapple.price());
		System.out.println();
		System.out.printf("Total Weight:" + objredapple.TotalWeight(30,2) + "g");
		System.out.println(objredapple.toString());
		System.out.println();
		
		System.out.println("-GREENAPPLE-");
		System.out.printf("Total Price : RM" + objgreenapple.price());
		System.out.println();
		System.out.printf("Total Calorie Per Intake: " + objgreenapple.TotalCalories(100,30) + "kcal");
		System.out.println(objgreenapple.toString());
	}

}
