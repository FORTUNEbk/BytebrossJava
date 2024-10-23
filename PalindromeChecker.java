public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanedStr.length() - 1;
        
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args) {
        String example1 = "madam";
        String example2 = "that";
        
        System.out.println("Is '" + example1 + "' a palindrome? " + isPalindrome(example1)); 
        System.out.println("Is '" + example2 + "' a palindrome? " + isPalindrome(example2)); 
    }
}
