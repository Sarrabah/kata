/*A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation. */
import java.util.*;
public class PangramChecker {
    public boolean check(String sentence){
        sentence= sentence.toLowerCase();
        HashSet <Character> letterOcc = new HashSet<Character>();
        for(int i = 0; i < sentence.length() ; i++){
            if(Character.isLetter(sentence.charAt(i))){
                letterOcc.add(sentence.charAt(i)); 
            }
        }
        System.out.println(letterOcc);
        int size = letterOcc.size();
        if(size == 26){
            return true;
        }
        else{
            return false;
        }
    }

    public void test(){
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }
}
