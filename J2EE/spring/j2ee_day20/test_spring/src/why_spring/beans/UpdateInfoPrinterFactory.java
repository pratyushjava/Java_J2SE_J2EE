package why_spring.beans;

public class UpdateInfoPrinterFactory {
	public static UpdateInfoPrinter getUpdateInfoPrinter()
	{
		return new UpdateInfoFilePrinter();
	}

}
