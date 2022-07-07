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
        int res=0;
        for(int i=0; i<n; i++){
            int hold=0;
            for(int j=i+1; j<n; j++){
                hold=ar.get(i)+ar.get(j);
                if(hold%k==0){
                    res++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String list = "1 3 2 6 1 2";
        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;
            arr.add(Character.getNumericValue(i));
        }

        System.out.println(DivisibleSumPairs.divisibleSumPairs(arr.size(), 3,arr));

        List<Integer> ar = Arrays.asList(1,2,3,4,5,6);
        System.out.println(DivisibleSumPairs.divisibleSumPairs(arr.size(), 5,ar));

    }
}
