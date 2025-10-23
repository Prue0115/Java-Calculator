public class Calculator {
    double num1;
    double num2;
    double result;

    public void setNumbers(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        result = num1 + num2;
        return result;
    }

    public double subtract(){
        result = num1 - num2;
        return result;
    }

    public double multiply(){
        result = num1 * num2;
        return result;
    }

    public double divide() {
        result = num1 / num2;
        return result;
    }

    public void displayResult(String operator){
        if ("π".equals(operator)) {
            System.out.printf("%d×%s=%.9f%n", (int)num1, Double.toString(Math.PI), result);
            return;
        }
        System.out.println((int)num1 + " " + operator + " " + (int)num2 + "=" + (result == (long)result ? String.format("%d",(long)result) : Double.toString(result)));
    }
}