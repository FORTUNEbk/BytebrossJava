
import java.util.Stack;

public class RemovingStar{
    public static void main(String[] args) {
        System.out.println(star("H*ell0*, we**come to"));
        
    }

    public static String star(String text){
        Stack<Character> sentence = new Stack<>();

        
        for(char val:text.toCharArray()){
            if(val =='*' && !sentence.isEmpty()){
                sentence.pop();

            }else{
                sentence.push(val);
            }
                
        }

        StringBuilder build = new StringBuilder();
        while(!sentence.isEmpty()){
            char value =sentence.pop();

            build.append(value);
        }
        return build.reverse().toString();


    
    }
}