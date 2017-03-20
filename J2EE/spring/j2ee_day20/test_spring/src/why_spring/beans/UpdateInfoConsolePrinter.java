package why_spring.beans;

public class UpdateInfoConsolePrinter implements UpdateInfoPrinter {
	public UpdateInfoConsolePrinter() {
		System.out.println("in constr of console printer");
	}

	@Override
	public void print(String methodName, Object oldValue, Object newValue) {
		System.out.println("Printing on console ");
		System.out.println("[Method=" + methodName +
                "|Old Value=" + oldValue +
                "|New Value=" + newValue + "]");

	}

}
