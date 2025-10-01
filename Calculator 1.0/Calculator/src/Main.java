public class Main {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();

        Calc.setNumbers(10, 5);
        Calc.add();
        Calc.displayResult("+");

        Calc.subtract();
        Calc.displayResult("-");

        Calculator advancedCalc = new Calculator();

        advancedCalc.setNumbers(20, 7);
        advancedCalc.multiply();
        advancedCalc.displayResult("*");

        advancedCalc.setNumbers(9, 3);
        advancedCalc.divide();
        advancedCalc.displayResult("/");
    }
}