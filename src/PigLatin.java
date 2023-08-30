/* Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway ! */
public class PigLatin {
    public String pigIt(String str){
        String[] strTab = str.split(" ");
        String result = "";
        String newStr ="";
        for(int i = 0 ; i < strTab.length ; i++){
            newStr ="";
          if((strTab[i].length() != 1)){
            newStr =strTab[i].substring(1) + strTab[i].charAt(0);
            if( i == strTab.length -1){
              newStr = newStr+"ay";
            }
           else{
            newStr = newStr+"ay ";
            }
            result = result+ newStr; 
          }
          else{
            if(Character.isLetter(strTab[i].charAt(0)) == false ){
              result = result + strTab[i].charAt(0);
            }
            else{
              result = result + strTab[i].charAt(0)+"ay ";
            }
          }            
        }
    return result;
    }
}
