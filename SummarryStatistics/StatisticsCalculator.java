package SummarryStatistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StatisticsCalculator {
    private double[] data;

    public StatisticsCalculator(double[] data) {
        this.data = data;
    }

    public double mean() {
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        return sum / data.length;
    }

    public double median() {
        Arrays.sort(data);
        int middle = data.length / 2;
        if (data.length % 2 == 0) {
            return (data[middle - 1] + data[middle]) / 2.0;
        } else {
            return data[middle];
        }
    }

    public double mode() {
        Map<Double, Integer> freqMap = new HashMap<>();
        for (double num : data) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        double mode = data[0];
        int maxCount = 0;
        for (Map.Entry<Double, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    public double variance() {
        double mean = mean();
        double varianceSum = 0;
        for (double num : data) {
            varianceSum += Math.pow(num - mean, 2);
        }
        return varianceSum / data.length;
    }

    public double standardDeviation() {
        return Math.sqrt(variance());
    }
}
