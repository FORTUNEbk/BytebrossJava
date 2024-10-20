public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        
        return totalSum - arrSum;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 8, 6, 3, 7}; 
        int n = 8; 
        
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
