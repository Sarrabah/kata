/*Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures. */

public class HumanReadableTime {
  public String makeReadable(int seconds) {
    String rStr="";
    int scd = seconds %60;
    int min = (seconds / 60)% 60;
    int hrs = (seconds / 60) /60;
    String scdStr="";
    String minStr="";
    String hrsStr="";
    if(scd/10 == 0 ){
       scdStr= "0"+String.valueOf(scd);
    }
    else{
      scdStr= String.valueOf(scd);
    }

    if(min/10 == 0 ){
       minStr= "0"+String.valueOf(min);
    }
    else{
      minStr= String.valueOf(min);
    }

    if(hrs/10 == 0 ){
       hrsStr= "0"+String.valueOf(hrs);
    }
    else{
      hrsStr= String.valueOf(hrs);
    }
    rStr= hrsStr+":"+ minStr+":"+scdStr;
    return rStr;  
  }
  public void test(){
    String result = makeReadable(0);
    System.out.println("the result is : "+result); 
  }
}