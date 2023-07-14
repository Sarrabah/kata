/* Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
spinWords( "This is a test") => returns "This is a test" 
spinWords( "This is another test" )=> returns "This is rehtona test"*/

public class SpinWords {
    public String spinWords(String sentence){
        String wordsF ="";
        String[] tabStr = sentence.split(" ");
        String[] tabF = new String[tabStr.length];
        for(int i =0 ;i <tabStr.length ; i++){
            int tabSize = tabStr[i].length();
            if( tabSize >=5 ){
                String inverse = "";
                for(int j = tabSize-1 ;j >=0; j--){
                    inverse = inverse + tabStr[i].charAt(j);
                }
                tabF[i] =inverse;
            }
            else{
                tabF[i]=tabStr[i];
            }
        }
        for(int k =0 ; k < tabF.length ; k++){
          if(k != tabF.length -1 ){
            wordsF = wordsF+tabF[k]+" ";
          }
          else{
            wordsF = wordsF+tabF[k];
          }            
          
        }
    return wordsF;
    }
}
