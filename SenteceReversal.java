public class SenteceReversal {
    public static void main(String[] args) {
        String sentence = "Hello world!";
        System.out.println(senteceReversal(sentence));
    }

    public static String senteceReversal(String sentence){
        String[] words = sentence.split(" ");
        String result = "";

        for(int i = words.length -1; i >= 0; i--){
            result =result + words[i] + " ";
        }

        return result;

    }
}
