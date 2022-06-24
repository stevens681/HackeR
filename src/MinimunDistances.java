import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimunDistances {
    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
        // Write your code here

        int min = Integer.MAX_VALUE, pIndex=0, index =0;
        HashMap<Integer, Integer> map = new HashMap<>();

        //Check for
        for(int i=0; i<a.size(); i++){
            if(map.containsKey(a.get(i))){
                index =i;
                pIndex = map.get(a.get(i));
                min = Math.min((index - pIndex), min);
            }
            map.put(a.get(i), i);

        }

        return min = (min == Integer.MAX_VALUE ? -1 : min);

    }

    public static void main(String[] args) {

    //7 1 3 4 1 7

        String list = "7 1 3 4 1 7";
        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;

            arr.add(Character.getNumericValue(i));

        }
        System.out.println(minimumDistances(arr));

    }
}
