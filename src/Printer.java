
public class Printer {

 private Calculator calculator;

    public Printer (Calculator calculator)
    {
        calculator = this.calculator ;
    }

    public void printOutput() {

        System.out.println(calculator.calculate(calculator.operand1, calculator.operand2));
    }


}
