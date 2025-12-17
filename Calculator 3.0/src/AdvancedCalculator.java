public class AdvancedCalculator extends Calculator {
    @Override
    public double multiply() {
        result = num1 * num2;
        return result;
    }

    @Override
    public double divide() {
        result = num1 / num2;
        return result;
    }

    public double mod() {
        double res = Double.NaN;
        if (num2 != 0) res = num1 % num2;
        result = res;
        return res;
    }
}