import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {
    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int res=0;  //Numeric value.
        String bribe ="";   //String value.
        //Reverse loop the queries.
        for(int i = q.size()-1; i>=0; i--){

            //Gets value and compares with 2
            if(q.get(i)-(i+1) > 2){
                //Too chaotic and breaks.
                bribe ="Too chaotic";
                break;
            }
            //Loops from 0 and up.
            for(int j = Math.max(0, q.get(i)-2); j<i; j++){
                //Counts if is more than 0
                if(q.get(j)>q.get(i)){
                    res++;
                }

            }
            //sets the bribe.
            bribe = Integer.toString(res);

        }
        System.out.println(bribe);
    }

    public static void main(String[] args) {
//        String list = "2 1 5 3 4";
        String list = "2 5 1 3 4";

        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;

            arr.add(Character.getNumericValue(i));

        }
        minimumBribes(arr);

    }
}
