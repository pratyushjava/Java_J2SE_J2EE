package why_spring.beans;

public interface UpdateInfoPrinter {
	void print(String methodName, Object oldValue, Object newValue);
}
