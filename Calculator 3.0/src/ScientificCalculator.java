public class ScientificCalculator extends AdvancedCalculator {

    public double power() {
        result = Math.pow(num1, num2);
        return result;
    }

    public double pi() {
        result = num1 * Math.PI;
        return result;
    }
}
