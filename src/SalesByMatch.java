import java.util.Collections;
import java.util.List;

public class SalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int result=0, hold=0;
        Collections.sort(ar);
        for(int i=0; i<n; i++){

            if(hold==0){
                hold=ar.get(i);
                continue;
            }
            if(hold==ar.get(i)){
                result++;
                hold=0;
                continue;
            }
            else{
                hold=ar.get(i);
            }

        }

        return result;


    }

    public static void main(String[] args) {

    }
}
