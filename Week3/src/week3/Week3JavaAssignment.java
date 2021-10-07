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
		concatenateWord(word,n);
		
		
		// Problem 8
		
		String firstName = "Charlie";
		String lastName = "Dukes";
		createFullName(firstName,lastName);
		
		
		// Problem 9
		
		int[] numbers = {23, 42, 43};
		isGreaterThan100(numbers);
	
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


}