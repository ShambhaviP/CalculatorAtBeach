
public class Printer {

    private Calculator calculator;

    public Printer(Calculator calculator) {

        this.calculator = calculator;
    }

    public void printOutput() {

        System.out.println(calculator.calculate());
    }
    public static void main (String args[]) {

        InputReader inputReader = new InputReader();

        Calculator calculator = new Calculator(8, 9);
        Printer printer = new Printer(calculator);
        printer.printOutput();

    }

}
