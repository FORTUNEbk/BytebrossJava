public class FirstOccurence {
    public static void main(String[] args) {
        String haystack = "adbutsad";
        String needle = "sad";
        System.out.println(firstOccurence(haystack, needle));
    }

    public static int firstOccurence(String heystack, String needle){
        int hayLength = heystack.length();
        int nedLength = needle.length();

        if(nedLength > hayLength){
            return -1;
        }

        for(int i = 0; i <= hayLength - nedLength; i++){
            int j = 0;
            while (j < nedLength && heystack.charAt(i + j)== needle.charAt(j)) { 
                j++;
                if(j == nedLength){
                    return i;
                }
            }
        }
        return -1;
    }
    
}
