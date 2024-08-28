public class BinarySearch{

    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5, 6};
        int target = 4;
        System.out.println(findFirstOccurrence(numbers, target));

        target = 2;
        System.out.println(findFirstOccurrence(numbers, target));

        target = 7;
        System.out.println(findFirstOccurrence(numbers, target));
    }
}
