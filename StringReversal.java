public class StringReversal {

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        
        int start = 0;
        int end = charArray.length - 1;
        
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            
            start++;
            end--;
        }
        
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input1 = "hello";
        String reversed1 = reverseString(input1);
        System.out.println("Original: " + input1);
        System.out.println("Reversed: " + reversed1);
        
        String input2 = "Java";
        String reversed2 = reverseString(input2);
        System.out.println("Original: " + input2);
        System.out.println("Reversed: " + reversed2);
        
        String input3 = "";
        String reversed3 = reverseString(input3);
        System.out.println("Original: " + input3);
        System.out.println("Reversed: " + reversed3);
    }
}