/* Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
    132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6 */
//import java.util.* ;
public class DigitalRoot{
    public static int digitalRoot(int n) {
        int sum =0 ;
        if(n < 10){
            sum = n;
        }
        else if(n >= 10){
            while(n >= 10){
                String nString = n + "";
                sum = 0;
                for(int i = 0 ; i < nString.length() ; i++){
                    int nbInteger = Character.getNumericValue(nString.charAt(i));
                    sum = sum + nbInteger ; 
                }               
                    n = sum;                         
            }
        }   
        return sum ;       
    }

    public void test(){
    
    int somme= digitalRoot(735);
    
        System.out.println("la somme est :" +somme);
    
}
}

