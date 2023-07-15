/* The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 
Notes
Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input! */

import java.util.*;
public class DuplicateEncoder {
    public String encode(String word){
        HashMap<Character, Integer> charOcc = new HashMap<Character,Integer> () ;
        word = word.toLowerCase();
        String newWord ="";
        for (int i = 0 ; i < word.length() ; i++){
            if(charOcc.containsKey(word.charAt(i))){
                charOcc.put(word.charAt(i), charOcc.get(word.charAt(i))+1);
            }
            else{
                charOcc.put(word.charAt(i),1);
            }
        }
        for(int j =0 ;j < word.length() ; j++){
            int nbOcc = charOcc.get(word.charAt(j));
            if( nbOcc >=2 ){
                newWord= newWord + ")";
            }
            else{
                newWord= newWord + "(";
            }
        }
        return newWord;
    }
}
