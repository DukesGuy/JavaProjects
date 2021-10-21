package week5;

public class App {

	public static void main(String[] args) {
		AsteriskLogger stars = new AsteriskLogger();
		SpacedLogger spaced = new SpacedLogger();
		
		stars.log("Hello");
		System.out.println();
		stars.error("Hello");
		System.out.println();
		spaced.log("Hello");
		System.out.println();
		spaced.error("Hello");
	}

}
