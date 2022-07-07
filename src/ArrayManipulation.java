import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayManipulation {
    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long res = 0, sum = 0;  //
        long[] arr = new long[n+1];
        for(List<Integer> i: queries) {
            int a = i.get(0);
            int b = i.get(1);
            int k = i.get(2);
            arr[a-1] += k;
            arr[b] -= k;
        }

        for(int i = 0; i<n; i++){
            sum += arr[i];
            res = Math.max(res, sum);
        }

        return res;

    }

    public static void main(String[] args) {

        int n = 10;
        String list = """
                2 6 8
                3 5 7
                1 8 1
                5 9 15""";
//        int n = 5;
//        String list = """
//                1 2 100
//                2 5 100
//                3 4 100""";
//        int n = 10;
//        String list = """
//                1 5 3
//                4 8 7
//                6 9 1""";

        List<List<Integer>> arr = new ArrayList<>();

        String[] split = list.split("\n");

        for(int i = 0; i<list.split("\n").length; i++){

            String[] space = split[i].split("\\s");
            List<Integer> hold = new ArrayList<>();
            for (String s : space) {
                hold.add(Integer.parseInt(s));
            }
            if(!hold.isEmpty())
                arr.add(hold);

        }
        System.out.println(arrayManipulation(n, arr));


    }
}
