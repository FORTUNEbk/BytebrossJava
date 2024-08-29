import java.util.Arrays;

public class SearchLoop {
    public static void main(String[] args) {
        int[] number = {1, 2, 2, 3, 2, 1};

        int[] result = sortArray(number);
        System.out.println(Arrays.toString(result));

    }

    public static int firstOccurence(int[] arr, int target){
        for(int i =0; i < arr.length; i++){
            if(arr[i] == target)
            return i;
        }
        return -1;
    }

    public static int[] sortArray(int[] numbers){
        for(int i =0; i < numbers.length; i++){

        int minIndex = i;

            for(int j =i +1; j < numbers.length; j++){
                if(numbers[j] < numbers[i]){
                    minIndex = j;
                }
                
            }
            int temp = numbers[minIndex];

            numbers[minIndex] = numbers[i];
            numbers[i] = temp;

        }
        return numbers;
    }

    
}
