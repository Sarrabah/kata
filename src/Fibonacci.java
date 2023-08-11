/* Create function fib that returns n'th element of Fibonacci sequence (classic programming task). */
import java.util.*;
public class Fibonacci {
    public int fib (int n){
        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab.add(0);
        tab.add(1);
        tab.add(1);
    if (n > 2){
        for(int i = 3 ; i <= n ; i++){
            int r= tab.get(i-1)+tab.get(i-2);
            tab.add(r);
        }
    }
    return tab.get(n);
    }
}
