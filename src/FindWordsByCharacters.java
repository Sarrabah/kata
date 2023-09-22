import java.util.HashMap;

/* You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be used once).
Return the sum of lengths of all good strings in words.

Example 1:
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

Example 2:
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10. */
public class FindWordsByCharacters {
    public int countCharacters(String[] words,String chars) {
        int sum = 0;
        HashMap<Character, Integer> charsHashMap = new HashMap<>();
        for(int i = 0 ;  i < chars.length() ; i++){
            char charsCharacter = chars.charAt(i);
            if(charsHashMap.containsKey(charsCharacter)){
                int newVal = charsHashMap.get(charsCharacter)+1;
                charsHashMap.put(charsCharacter, newVal);
            }
            else {
                charsHashMap.put(charsCharacter, 1);
            }
        }

        
        for(int j= 0 ; j < words.length ; j++){
            HashMap<Character, Integer> charsHashMapCopy = charsHashMap;
            System.out.println(charsHashMap);
            String word = words[j];
            //System.out.println("j : " +j);
            int k = 0;
            Boolean conti = true ;

            while ( conti == true && k < word.length()){
                    char wordChar = word.charAt(k);
                    if(charsHashMapCopy.containsKey(wordChar) && charsHashMapCopy.get(wordChar) > 0){
                        int newValCopy = charsHashMapCopy.get(wordChar)-1 ;
                        charsHashMapCopy.put(wordChar, newValCopy);
                        k++;
                    }
                    else {
                        conti = false ;
                        //System.out.println("fal: ");
                    }
            }
            if( k == word.length()){
                sum = sum + word.length();
                //System.out.println("sum = "+ sum);
            }
            //System.out.println("1");

        }

    return sum;
    }
}
