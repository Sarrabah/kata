/* Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

Notes:

Only lower case letters will be used (a-z). No punctuation or digits will be included.
Performance needs to be considered.
Examples
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False */
import java.util.*;

public class Scramblies {
    public boolean scramble(String str1, String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        HashMap<Character,Integer> lettersOcc = new HashMap<Character, Integer>();
        for( int i =0 ; i < str1.length(); i++){
            if(lettersOcc.containsKey(str1.charAt(i))){
                lettersOcc.put(str1.charAt(i), lettersOcc.get(str1.charAt(i))+1);
            }
            else{
                lettersOcc.put(str1.charAt(i),1);
            }
        }
        
        int j=0;
        //boolean result = false;
        while((j < str2.length()) && (lettersOcc.containsKey(str2.charAt(j)))){             
            lettersOcc.put(str2.charAt(j), lettersOcc.get(str2.charAt(j))-1); 
            if(lettersOcc.get(str2.charAt(j)) == -1){
                return false;
            } 
            j++;       
        }
        if( j == str2.length()){
            return true;
        }
        else{
            return false;
        }
    }
    public void test(){
        System.out.println(scramble("scriptjavx","javascript"));
    }
}
