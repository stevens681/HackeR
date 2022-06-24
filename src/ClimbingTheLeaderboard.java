import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class ClimbingTheLeaderboard {
    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        NavigableMap<Integer, Integer> org = new TreeMap<>();
        int count = 1;
        for(Integer i: ranked){
            if(!org.containsKey(i)){
                org.put(i, count);
                count++;
            }
        }
        if(!org.containsKey(0))
            org.put(0, count);

        for(Integer i: player){

            res.add(org.get(org.floorKey(i)));
        }

        return res;

    }


    public static void main(String[] args) {

        String list = "100 90 90 80 75 60";
        String list2 = "50 65 77 90 102";
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        String[] a= list.split(" "), b=list2.split(" ");

        for(String i: a)
            arr.add(Integer.parseInt(i));

        for(String i: b)
            arr2.add(Integer.parseInt(i));

        System.out.println(climbingLeaderboard(arr, arr2));

    }
}
