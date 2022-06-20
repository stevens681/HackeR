import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TheHurdleRace {
    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int res = 0;

        System.out.println("This is k: " +k);
        for(Integer i: height)
            System.out.println(i);

        if(k< Collections.max(height)){
            res = Collections.max(height)-k;
        }

        return res;
    }
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        Random n=new Random();
        for(int i=0; i<4; i++){
            arr.add(n.nextInt(100));
        }
        System.out.println(hurdleRace(n.nextInt(100), arr));

    }
}
