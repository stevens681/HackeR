import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {
    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        System.out.println(q);
    }

    public static void main(String[] args) {
        String list = "2 1 5 3 4";
        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;

            arr.add(Character.getNumericValue(i));

        }
        minimumBribes(arr);

    }
}
