/* Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"
with the p(i) in increasing order and n(i) empty if n(i) is 1.

Example: n = 86240 should return "(2**5)(5)(7**2)(11)" */
import java.util.TreeMap;
public class PrimeDecomp {
    public Boolean isItPrime(int number){
        int i = 2;
        while(i < number-1) {
            if(number % i == 0){
               return false ;
            }
            else{
                i++;
            }
        }
        return true;
    }
    public TreeMap<Integer, Integer> addElement (TreeMap<Integer,Integer> primeOcc ,int number){
        if(primeOcc.containsKey(number)){
            int occ = primeOcc.get(number);
            primeOcc.put(number, occ+1);
        }
        else{
            primeOcc.put(number,1);
        }
        return primeOcc;
    }
    public String factors(int n) {
        TreeMap<Integer, Integer>  primeOcc= new TreeMap<Integer, Integer>();
        String result = "";
        int nb = 2;
        while( n != 1 ){
            if( n % nb == 0 ) {
                if(( nb == 2 ) || ( nb == 3 )){
                    primeOcc= addElement (primeOcc ,nb);
                    n = n/nb ;
                }
                else if (nb >= 4){
                    if(isItPrime(nb) == true){
                        primeOcc= addElement (primeOcc ,nb);
                        n = n/nb ;
                    }
                    else {
                        nb++;
                    }
                }
            }
            else{
                nb++;
            }
        }
        for(Integer i : primeOcc.keySet()){
            if(primeOcc.get(i) == 1){
                result = result + "("+ Integer.toString(i)+")";
            }
            else{
                result = result + "("+ Integer.toString(i) + "**"+ Integer.toString(primeOcc.get(i)) + ")";
            }
        }
        return result;
    }
}
