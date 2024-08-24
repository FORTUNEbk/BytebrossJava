import java.util.ArrayList;
import java.util.List;

public class PointsCalculator {
    public static int calPoints(String[] ops) {
        List<Integer> record = new ArrayList<>();

        for (String op : ops) {
            switch (op) {
                case "C":
                    if (!record.isEmpty()) {
                        record.remove(record.size() - 1);
                    }
                    break;
                case "D":
                    if (!record.isEmpty()) {
                        record.add(2 * record.get(record.size() - 1));
                    }
                    break;
                case "+":
                    if (record.size() >= 2) {
                        int last = record.get(record.size() - 1);
                        int secondLast = record.get(record.size() - 2);
                        record.add(last + secondLast);
                    }
                    break;
                default:
                    record.add(Integer.parseInt(op));
                    break;
            }
        }

        return record.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));  // Output: 30
        System.out.println(calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));  // Output: 27
        System.out.println(calPoints(new String[]{"1"}));  // Output: 1
    }
}
