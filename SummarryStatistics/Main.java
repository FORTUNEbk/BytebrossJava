package SummarryStatistics;

public class Main {
    public static void main(String[] args) {
        double[] data = {1, 2, 2, 3, 4, 4, 4, 5, 6};

        StatisticsCalculator statsCalculator = new StatisticsCalculator(data);

        System.out.println("Mean: " + statsCalculator.mean());
        System.out.println("Median: " + statsCalculator.median());
        System.out.println("Mode: " + statsCalculator.mode());
        System.out.println("Variance: " + statsCalculator.variance());
        System.out.println("Standard Deviation: " + statsCalculator.standardDeviation());
    }
}
