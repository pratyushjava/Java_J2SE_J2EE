package jsfBean;


public class CalculatorConroller {
    private Calculator calculator = new Calculator();

    private int firstNumber = 51;

    private int result = 0;

    private int secondNumber = 123;

    public CalculatorConroller() {
        super();
    }

    public void setCalculator(Calculator aCalculator) {
        this.calculator = aCalculator;
    }

    public void setFirstNumber(int aFirstNumber) {
        this.firstNumber = aFirstNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getResult() {
        return result;
    }

    public void setSecondNumber(int aSecondNumber) {
        this.secondNumber = aSecondNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public String add() {

        result = calculator.add(firstNumber, secondNumber);

        return "success";
    }

    public String multiply() {

        result = calculator.multiply(firstNumber, secondNumber);

        return "success";
    }
	public String clear()
	{
		result=0;
		firstNumber=secondNumber=0;
		return null;
	}
}
