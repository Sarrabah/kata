/*Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new  */
import java.util.*;
public class ArrayDiff {

  public static int[] arrayDiff(int[] a, int[] b) {
     ArrayList<Integer> result = new ArrayList<Integer> ();
    
    ArrayList<Integer> arrA = new ArrayList<Integer> ();
    
    for(int k =0 ; k < a.length ; k++){
      arrA.add(a[k]);
    }
     
  if(arrA.size() == 0){
            //int[] resultArr = new int[result.size()];
            //return resultArr;
    result.clear();
        }
  else if(b.length == 0){ 
    for (Integer i : arrA){
      result.add(i);
    }
            //return a; 
        }
  else if (a.length > 0 && b.length > 0){
      for (int i = 0 ; i < arrA.size(); i++){              
        for (int j = 0 ; j < b.length ; j++){
          if (arrA.get(i) != b[j]){
            result.add(arrA.get(i));
          }
          else if (arrA.contains(b[j])){
            if( i > 0 ){
              arrA.remove(i);
              i--;
            }
          }
        }
      }
  }
    int[] resultArr = new int[result.size()];
    for(int l= 0; l < result.size(); l++){
      resultArr[l]= result.get(l);
    }
    return resultArr;
    }   

    

  public void test(){
    int[] arrayA = new int[] {1,2,2,3,3};
    int[] arrayB = new int[] {1};
    //System.out.println(arrayB.length);
    int[] result = arrayDiff(arrayA, arrayB);
    for(int i =0 ;i < result.length; i++){
        System.out.println(result[i]);
    }
}
}   

/*autre façon
 ArrayList<Integer> arrFinale = new ArrayList<Integer> ();
    HashSet<Integer> resultSet = new HashSet<Integer> ();
    HashMap <Integer, Integer> aHash = new HashMap<Integer, Integer> ();
    
    if(a.length == 0){
    arrFinale.clear();
        }
    else if(b.length == 0){ 
    for (int k =0 ;k < a.length ; k++){
      arrFinale.add(a[k]);
      }
    }
    else if(a.length > 0 && b.length > 0){
    
      for(int i =0 ; i < a.length ; i++){
        if(aHash.containsKey(a[i]) == true){
        aHash.put(a[i],(aHash.get(a[i]))+1);
      }
      else{
        aHash.put(a[i],1);
        }
      }
      
    for (int j = 0 ; j < b.length; j++){
      if(aHash.containsKey(b[j])){
          resultSet.add(b[j]);
        }
    }
      

      
      for(Integer key: aHash.keySet()){
      for(Integer i: resultSet){
        if(key != i){
           if(aHash.get(key)>1){
             for(int f = 0 ; f < aHash.get(key); f++){
             arrFinale.add(key);
            }
             }
             else{
               arrFinale.add(key);
             }
           }
          
        }
      }
      }

    int[] resultArr = new int[arrFinale.size()];
    for(int l= 0; l < arrFinale.size(); l++){
      resultArr[l]= arrFinale.get(l);
    }
    return resultArr ;
   } */ 