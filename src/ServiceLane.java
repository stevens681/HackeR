import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServiceLane {
    /*
     * Complete the 'serviceLane' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY cases
     */

    public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<cases.size(); i++){
            List<Integer> sub = width.subList(cases.get(i).get(0), cases.get(i).get(1)+1);
            res.add(Collections.min(sub));
        }

        return res;
    }


    public static void main(String[] args) {

    }
}
