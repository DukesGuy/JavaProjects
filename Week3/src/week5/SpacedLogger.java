package week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println(formatMessage(message));
	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: " + formatMessage(message));
	}
	
	String formatMessage(String message) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < message.length(); i++) {
			builder.append(message.charAt(i)).append(" ");
		}
		return builder.toString();
	}

}
