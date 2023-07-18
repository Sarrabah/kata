/* The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
// should be 6: {4, -1, 2, 1}
Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray. */
public class Max {
    public int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            int negatif = 0;
            int positif = 0;
            int sumP = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    positif++;
                    sumP = sumP + arr[i];
                } else {
                    negatif++;
                }
            }
            if (positif == arr.length) {
                return sumP;
            } else if (negatif == arr.length) {
                return 0;
            }
            int sum = 0;
            int sumMax = 0;
            for (int j = 0; j <= arr.length-1; j++) {
                sum = 0;
                for (int k = j + 1; k < arr.length; k++) {
                    sum = sum + arr[k];
                    if (sum > sumMax) {
                        sumMax = sum;
                    }
                }
            }
            return sumMax;
        }
    }
}
