/* Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true */
import java.util.*;
public class RansomNote {
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character, Integer> magazineMap = new HashMap<>();
            for(int i =0 ; i < magazine.length() ; i++){
                if(magazineMap.containsKey(magazine.charAt(i))){
                    int newValue = magazineMap.get(magazine.charAt(i))+1 ;
                    magazineMap.put(magazine.charAt(i), newValue);
                }
                else{
                    magazineMap.put(magazine.charAt(i), 1);
                }
            }
            //System.out.println(magazineMap);
            Boolean exist = false;
            int j = 0;
            if(magazineMap.containsKey(ransomNote.charAt(j))){
                exist = true;
                while(j < ransomNote.length() && exist == true){
                    if( magazineMap.containsKey(ransomNote.charAt(j)) && magazineMap.get(ransomNote.charAt(j)) > 0 ){
                        int newValueIncrement = magazineMap.get(ransomNote.charAt(j))-1;
                        magazineMap.put(ransomNote.charAt(j), newValueIncrement );
                        j++;
                    }
                    else {
                        exist = false;
                    }
                }
            }
            return exist;
        }
        public void test (){
            Boolean result = canConstruct("aa","aab");
            System.out.println("it's " + result);
        }

}
