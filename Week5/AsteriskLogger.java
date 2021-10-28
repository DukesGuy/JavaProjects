package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");	
	}

	@Override
	public void error(String message) {
		String errorMessage = formatMessage(message);
		String asterisks = "*".repeat(errorMessage.length());
		
		System.out.println(asterisks);
		System.out.println(errorMessage);
		System.out.println(asterisks);
	}

	private String formatMessage(String message) {
		return "***ERROR: " + message + "***";
	}

}
