public class NumberOfSteps {
    public int nbOfSteps (int num){
        int nbSteps = 0;
        while(num > 0 ){
            if(num % 2 == 0 ){
                num = num/2 ;
                nbSteps++;
            }
            else {
                num = num-1;
            nbSteps++;
            }
        }
        return nbSteps;
    }
}
