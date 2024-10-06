public class First {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(findNeedle(haystack, needle)); 
       
    }

    public static int findNeedle(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
