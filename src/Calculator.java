//A Calculator that has two operands
public class Calculator implements Operations {

    double operand1;
    double operand2;

    public Calculator(double operand1, double operand2) {

        operand1 = this.operand1;
        operand2 = this.operand2;

    }

    public double add(int operand1, int operand2) {

        return operand1 + operand2 ;
    }

    @Override
    public double calculate(double operand1, double operand2) {

        return operand1 + operand2 ;
    }
}
