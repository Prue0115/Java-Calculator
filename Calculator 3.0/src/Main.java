public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();

        calc_add.setNumbers(5, 3);
        calc_add.add();
        calc_add.displayResult("+");

        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10, 2);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        Calculator calc_sub = new Calculator();
        calc_sub.setNumbers(10, 20);
        calc_sub.subtract();
        calc_sub.displayResult("-");

        ScientificCalculator sci_calc = new ScientificCalculator();
        ScientificCalculator sci_calc2 = new ScientificCalculator();

        sci_calc.setNumbers(3, 2);
        sci_calc.power();
        sci_calc.displayResult("^");

        sci_calc2.setNumbers(16, 0);
        sci_calc2.pi();
        sci_calc2.displayResult("π");
    }
}