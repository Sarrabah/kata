public class StringSplit {
    public String[] solution(String s){
        int sizeS = s.length();
        String[] tabS = new String[sizeS/2 + sizeS%2];
         int j =0;
        if( sizeS % 2 == 0){          
            for(int i=0 ; i < sizeS ; i=i+2){
                tabS[j]= String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i+1));
                j++;
            }
        }
        else{
            for(int i=0 ; i < sizeS ; i=i+2){
                if(i == sizeS-1){
                    tabS[j] = String.valueOf(s.charAt(i))+"_";
                }
                else{
                    tabS[j]= String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i+1));
                    j++; 
                }                
            }
        }
        return tabS;
    }
}
