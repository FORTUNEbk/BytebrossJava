import java.util.Arrays;

public class ArrayManipulation {

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];  
        }
        
        System.arraycopy(rotated, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        rotateArray(arr1, 2);
        System.out.println("Rotated array (k=2): " + Arrays.toString(arr1));

     
    }
}