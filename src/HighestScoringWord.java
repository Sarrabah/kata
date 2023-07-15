/* Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

For example, the score of abad is 8 (1 + 2 + 1 + 4).

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid. */
import java.util.*;

public class HighestScoringWord {
    public String high(String s){
        s = s.toLowerCase();
        HashMap<Character,Integer> alphIndex = new HashMap<Character,Integer>();
        char[] letters ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i =0; i < letters.length ; i++){
            alphIndex.put(letters[i], i+1);
        }
        String[] tabWords = s.split(" ");
        int scoreW =0;
        int scoreF = 0;
        String wordF="";
        for(int j =0 ; j < tabWords.length ; j++){
            for(int k=0 ; k < tabWords[j].length(); k++){
                scoreW =scoreW + alphIndex.get(tabWords[j].charAt(k));
            }
            if(scoreW > scoreF){
                scoreF = scoreW;
                wordF = tabWords[j];
            }
            scoreW =0;
        }
        return wordF;
    }
}
