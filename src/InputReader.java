import java.util.Scanner;

public class InputReader {

    private Calculator calculator;

    public InputReader() {

    }

    public void readInput() {

        Scanner scanner = new Scanner(System.in);
        calculator.operand1 = scanner.nextDouble();
        calculator.operand2 = scanner.nextDouble();
    }
}
