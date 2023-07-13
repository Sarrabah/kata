/*You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]*/


public class FindOutlier {
  public int find(int[] integers) {
    int compP = 0;
    int compImp = 0;
    for(int i =0 ; i < integers.length ; i++){
        if(integers[i] % 2 == 0){
            compP++;
        }
        else{
            compImp++;
        }
    }
    int result=0;
    if(compP == 1 ){
        for(int j =0; j <integers.length; j++){
            if(integers[j] %2 ==0){
                result =integers[j];
            }
        }
    }
    else if(compImp ==1) {
        for(int j =0; j <integers.length; j++){
            if(integers[j] %2 != 0){
                result =integers[j];
            }
        }
    }
    return result;
  }
  public void test(){
    int[] tab ={2,6,8,-10,3};
    int result = find(tab);
    System.out.println("the result is = "+result);
  }
}

/*Autre méthode plus complexe:
    HashMap<String, ArrayList<Integer>> classification = new HashMap <String, ArrayList<Integer>> ();
    ArrayList<Integer> numbersP = new ArrayList<Integer> ();
    ArrayList<Integer> numbersImp = new ArrayList<Integer> ();

    for(int i=0 ;i < integers.length ; i++){
        if(integers[i] % 2 == 0) {
            numbersP.add(integers[i]);
            classification.put("pair",numbersP);           
        }
        else{
            numbersImp.add(integers[i]);
             classification.put("impair",numbersImp); 
        }
    }
    int diffNb=0;
    System.out.println(classification);
    for(ArrayList<Integer> arr : classification.values()){
        if(arr.size() == 1){
            diffNb = arr.get(0);
            
        }
    }
    return diffNb; */