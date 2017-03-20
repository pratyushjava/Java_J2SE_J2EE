package why_spring.beans;

public class UpdateInfoFilePrinter implements UpdateInfoPrinter {

	@Override
	public void print(String methodName, Object oldValue, Object newValue) {
		System.out.println("Logging change in Text File ");
		System.out.println("[Method=" + methodName +
                "|Old Value=" + oldValue +
                "|New Value=" + newValue + "]");

	}

}
