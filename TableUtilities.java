 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result="";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int mulValue=i*j;
                if(mulValue<10)
                {
                    result +="  "+mulValue+" |";
                }
                else
                {result+=" "+mulValue+" |";}
            }
            result+="\n";
        }
        return result;
        }
      
    

    public static String getLargeMultiplicationTable() {
        String result="";
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                int mulValue=i*j;
                if(mulValue>99){
                    result+=mulValue+" |";break;
                }
                if(mulValue<10)
                {
                    result +="  "+mulValue+" |";
                }
                else{
                    result+=" "+mulValue+" |";
                }
            }
            result+="\n";
        }
        return result;
        }
    


    public static String getMultiplicationTable(int tableSize) {
        String result="";
        for(int i=1;i<=tableSize;i++){
            for(int j=1;j<=tableSize;j++){
                int mulValue=i*j;
                if(mulValue>99){
                    result+=mulValue+" |";
                }
                else if(mulValue<10)
                {
                    result +="  "+mulValue+" |";
                }
                else if(mulValue>9 && mulValue<100){
                    result+=" "+mulValue+" |";
                }
            }
            result+="\n";
        }
        return result;
    }
}
