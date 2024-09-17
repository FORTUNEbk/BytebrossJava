
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AveragePositiveNumbers {
    public static void main(String[] args) {
       List<Integer> inputNumbers = Arrays.asList(5, 10, -3, 10, 20, 5, -1);
       System.out.println(average(inputNumbers));
       System.out.println(sum(inputNumbers));
       System.out.println(square(inputNumbers));
        
    
    }
    public static double average(List<Integer> numbers){
        return numbers.stream()
        .filter(num -> num >0)
        .distinct()
        .mapToDouble(Integer::doubleValue)
        .average()
        .getAsDouble();
    }

    public static int sum(List<Integer>numbers){
        return numbers.stream()
                      .mapToInt(Integer::intValue)
                      .sum();

    }

    public static ArrayList<Integer> square(List<Integer>numbers){
        return numbers.stream()
                        .map(num -> num * num)
                       // .collect(Collectors.toCollection(ArrayList::new));

                       .collect(Collectors.toCollection(ArrayList::new));
    }


    
}
