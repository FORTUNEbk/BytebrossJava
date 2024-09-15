import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AvaragePositive {

    public static double calculateAverageOfUniquePositiveNumbers(List<Integer> numbers) {
        List<Integer> uniquePositiveNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > 0 && !uniquePositiveNumbers.contains(number)) {
                uniquePositiveNumbers.add(number);
            }
        }

        int sum = 0;
        for (Integer number : uniquePositiveNumbers) {
            sum += number;
        }

        if(sum ==0)return 0;

        double average = (double) sum / uniquePositiveNumbers.size();

        return average;
    }

    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(5, 10, -3, 10, 20, 5, -1);

        double result = calculateAverageOfUniquePositiveNumbers(inputNumbers);

        if (inputNumbers.isEmpty()) {
            System.out.println("No valid numbers were entered.");
        
        }else{
            System.out.println(result);
        }

    }  
}
