public class CreatePhoneNumber {
    public String createPhoneNb(int[] numbers) {
        String result = "(";
        for(int i = 0; i < numbers.length; i++){
            if( i == 3 ){
                result = result + ") " + numbers[i] ;
            }
            else if (i == 6){
                result = result + "-" + numbers[i];
            }
            else{
                result = result + numbers[i];
            }
        }
        return result; 
    }

    public void test(){  
        int[] nb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0 } ;
        System.out.println("the phone number = " + createPhoneNb(nb));
    }
}