package week3;

public class Week3JavaAssignment {
	
	public static void main(String[] args) {
		
		// Problems 1a and 1b
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 10};
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		
		// Problem 1c
		
		int sum = 0;
		double average = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		average = (double)sum / ages.length;
		System.out.println("Average age = " + average);
		
		
		// Problem 2a
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int charSum = 0;
		double avgChars = 0;
		for (int i = 0; i < names.length; i++) {
			charSum += names[i].length();
		}
		avgChars = (double)charSum / names.length;
		System.out.println("Average number of letters = " + avgChars);
		
		
		// Problem 2b
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		} System.out.println();
		
		
		// Problem 3 and 4
		// The last element in an array is accessed by names[names.length - 1]
		// The first element in an array is accessed by names[0]
		
		
		// Problem 5
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		
		// Problem 6
		
		int nameSum = 0;
		for (int i = 0; i < names.length; i++) {
			nameSum += nameLengths[i];
		}
		System.out.println("Sum of all letters = " + nameSum);
		
		
		// Problem 7
		
		String word = "Hello";
		int n = 3;
		concatenateWord(word, n);
		
		
		// Problem 8
		
		String firstName = "Charlie";
		String lastName = "Dukes";
		createFullName(firstName, lastName);
		
		
		// Problem 9
		
		int[] numbers = {23, 42, 43};
		isGreaterThan100(numbers);
		
		
		// Problem 10
		
		double[] elements = {22.2, 33.3, 44.4};
		returnAverage(elements);
		
		
		// Problem 11
		
		double[] numbers1 = {12.3, 45.6, 78.9};
		double[] numbers2 = {22.3, 55.6, 88.9};
		isArrayAverageGreater(numbers1, numbers2);
		
		
		// Problem 12
		
		boolean isHotOutside = true;
		double moneyInPocket = 15.00;
		willBuyDrink(isHotOutside, moneyInPocket);
		
		
		// Problem 13
		// Given the amount of hours in a day that the user has been playing New World, 
		// return some advice for the gamer i.e., 0-3 hours returns "Keep up the grind!",
		// 4-7 hours returns "Go grab some food.", 8+ hours returns "Go touch some grass..."
		// This will keep us fellow gamers held accountable :)
		
		double hoursPlayed = 8.5;
		whatShouldIdo(hoursPlayed);
		
	}

	
	// Method for Problem 7
	
	private static String concatenateWord(String word, int n) {
		String newWord = "";
		for (int i = 0; i < n; i++) {
			newWord += word;
		}
		return newWord;
	}
	
	
	// Method for Problem 8
	
	private static String createFullName(String firstName, String lastName) {
		return (firstName + " " + lastName);	
	}
	
	
	// Method for Problem 9
	
	private static boolean isGreaterThan100(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		if (sum > 100) {
			return true;
		}else {
			return false;
		}
	}


	// Method for Problem 10
	
	private static double returnAverage(double[] elements) {
		double sum = 0;
		for (int i = 0; i < elements.length; i++) {
			sum += elements[i];
		}
		return (sum / elements.length);
	}
	

	// Method for Problem 11
	private static boolean isArrayAverageGreater(double[] numbers1, double[] numbers2) {
		if (returnAverage(numbers1) > returnAverage(numbers2)) {
			return true;
		} else {
			return false;
		}
	}

	
	// Method for Problem 12
	
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	


	// Method for Problem 13
	
	private static void whatShouldIdo(double hoursPlayed) {
		if (hoursPlayed <= 3) {
			System.out.println("Keep up the grind!");
		} else if (hoursPlayed <= 7) {
			System.out.println("Go grab some food.");
		} else {
			System.out.println("Go touch some grass...");
		}
	}

}