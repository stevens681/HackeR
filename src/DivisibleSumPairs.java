import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int result=0;
        for(int i=0; i<n; i++){
            int hold=0;
            for(int j=i+1; j<n; j++){
                hold=ar.get(i)+ar.get(j);
                if(hold%k==0){
                    result++;                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
//        for(int i=0; i<6; i++){
//            arr.add(i+1);
//        }
        //1 3 2 6 1 2

        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(2);

        //DivisibleSumPairs.divisibleSumPairs(6,3,arr);
        System.out.println(DivisibleSumPairs.divisibleSumPairs(arr.size(), 3,arr));

        List<Integer> ar = Arrays.asList(1, 2,3,4,5,6);
        System.out.println(DivisibleSumPairs.divisibleSumPairs(arr.size(), 5,ar));

    }
}
