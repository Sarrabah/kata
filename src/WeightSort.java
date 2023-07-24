/* My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.

I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.

For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.

Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?

Example:
"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes: 

"100 180 90 56 65 74 68 86 99"
When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers:

180 is before 90 since, having the same "weight" (9), it comes before as a string.

All numbers in the list are positive numbers and the list can be empty.

Notes
it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
For C: The result is freed. */
import java.util.*;

public class WeightSort{
    public int somme (String value){
        int sum = 0;
            for(int i = 0 ; i < value.length() ; i++){
                sum = sum + Character.getNumericValue(value.charAt(i));
            }
            return sum;
    }
    public void orderWeight(){
        String strng = "11 11 2000 10003 22 123 1234000 44444444 9999";
        String[] poids = strng.split(" "); 
       
       TreeMap<Integer, ArrayList<String>> sumPTree = new TreeMap<>();
       
        for(int j =0; j< poids.length; j++){
            ArrayList<String> pp = new ArrayList<>();
            int sum = somme(poids[j]);
            if (sumPTree.containsKey(sum)){
                pp = sumPTree.get(sum);
                pp.add(poids[j]);
                sumPTree.put(sum, pp);
            }
            else{
                pp.add(poids[j]);
                sumPTree.put(sum,pp);
            }
        }
       //System.out.println(sumPTree);
       String result = "";
       for(Integer i : sumPTree.keySet()){
        if(sumPTree.get(i).size() == 1){
            result = result  +((sumPTree.get(i)).get(0))+ " ";
        }
        else{
            ArrayList<String> arrP = new ArrayList<String> ();
            arrP= sumPTree.get(i);
            Collections.sort(arrP);
            //System.out.println("col " +arrP);
            for(String s: arrP){                 
                    result = result+ s + " " ;
            }
        }
       }
       System.out.println(result.trim());
    }
} 

/* une autre solution non optimale:
 String result = "";
       String minPoids;
       int sumValue;
       while(pSum.size() > 0){
        minPoids = "" ;
        int minSum = -1;
        //System.out.println(minSum);
        for(String p : pSum.keySet()){
            System.out.println("key : " +p);
            if( minSum == -1){
                minSum = pSum.get(p);
                //System.out.print("minsum = "+minSum);
            }
            sumValue = pSum.get(p);
             //System.out.print("the sum = "+sumValue);
                //System.out.println("sumValue = " + sumValue);
                if (sumValue <= minSum){
                    minSum = sumValue;
                    minPoids = p;
                    //System.out.println(minPoids);
                }
            }
            result = result + " "+ minPoids; 
            pSum.remove(minPoids);
            
            //System.out.println(pSum);
            System.out.println(pSum.size());
       }
 */