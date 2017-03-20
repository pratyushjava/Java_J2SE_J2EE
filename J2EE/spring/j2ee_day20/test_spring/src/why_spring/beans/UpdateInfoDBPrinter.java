package why_spring.beans;

public class UpdateInfoDBPrinter implements UpdateInfoPrinter {

	@Override
	public void print(String methodName, Object oldValue, Object newValue) {
		System.out.println("Logging change on DB table ");
		System.out.println("[Method=" + methodName +
                "|Old Value=" + oldValue +
                "|New Value=" + newValue + "]");

	}

}
