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
        int res=0;
        String bribe ="";
        for(int i = q.size()-1; i>=0; i--){

            if(q.get(i)-(i+1) > 2){
                bribe ="Too chaotic";
                break;
            }
            for(int j = Math.max(0, q.get(i)-2); j<i; j++){
                if(q.get(j)>q.get(i)){
                    res++;
                }

            }
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
