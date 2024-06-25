public class convertingToInteger {
    public static void main(String[] args) {
        String strInt = "123";
        int intValue = Integer.parseInt(strInt);
        System.out.println("String to Integer: " + intValue);

        String strFloat = "123.45";
        float floatValue = Float.parseFloat(strFloat);
        System.out.println("String to Float: " + floatValue);

        int number = 456;
        String strFromValueOf = String.valueOf(number);
        System.out.println("Integer to String using valueOf(): " + strFromValueOf);

        String strFromToString = Integer.toString(number);
        System.out.println("Integer to String using toString(): " + strFromToString);
    }
}
