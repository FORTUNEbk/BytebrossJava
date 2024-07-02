public class MathOperations {
    public static void main(String[] args) {
        double num1 = -5.4;
        double num2 = 3.7;

        double max = Math.max(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);

        double min = Math.min(num1, num2);
        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + min);

        double number = 16.0;
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + sqrt);

        double floatNum = 5.67;
        double floor = Math.floor(floatNum);
        double ceil = Math.ceil(floatNum);
        System.out.println("Floor of " + floatNum + " is: " + floor);
        System.out.println("Ceil of " + floatNum + " is: " + ceil);

        double doubleNum = -9.8;
        double abs = Math.abs(doubleNum);
        System.out.println("Absolute value of " + doubleNum + " is: " + abs);
    }

}
