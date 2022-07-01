import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        int n = arr.size();
        for(int i = 0; i < n; i++){
            res.add(arr.get((i+d)%n));
        }
        return res;

    }


    public static void main(String[] args) {
        String list = "1 2 3 4 5";
        int d = 4;
        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;

            arr.add(Character.getNumericValue(i));

        }
        System.out.println(rotateLeft(d, arr));
    }
}
