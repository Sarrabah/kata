public class App {
    public static void main(String[] args){
        DistributeCandies dc = new DistributeCandies();
        int[] arr = new int[]{1,1,1,1,2,2,2,3,3,3};
        int result = dc.distributeCandies(arr);
        System.out.println("the max type is : "+ result);
    }
}