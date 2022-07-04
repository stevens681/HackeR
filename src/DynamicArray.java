import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here

        int lastAnswer = 0;
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();

        for(int i = 0; i<n; i++){
            arr.add(new ArrayList<Integer>());
        }

        for (List<Integer> query : queries) {

            int idx = (query.get(1) ^ lastAnswer) % n;

            if (query.get(0) == 1) {
                arr.get(idx).add(query.get(2));
            }

            if (query.get(0) == 2) {
                int secondIndex = query.get(2) % arr.get(idx).size();
                lastAnswer = arr.get(idx).get(secondIndex);
                res.add(lastAnswer);
            }
        }

        return res;

    }


    public static void main(String[] args) {

    }
}
