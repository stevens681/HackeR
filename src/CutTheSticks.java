import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CutTheSticks {
    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here

        List<Integer> res = new ArrayList<>();
        while(true){
            res.add(arr.size());
            int shortStick= Collections.min(arr);
            arr.removeAll(Collections.singleton(shortStick));
            for(int i=0; i<arr.size(); i++){
                arr.set(i, arr.get(i)-shortStick);
            }
            if(arr.size()<1)break;
        }

        return res;

    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random n=new Random();
        for(int i=0; i<5; i++){
            arr.add(n.nextInt(5));
        }
        System.out.println(cutTheSticks(arr));
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(5);
        arr2.add(4);
        arr2.add(4);
        arr2.add(2);
        arr2.add(2);
        arr2.add(8);
        System.out.println(cutTheSticks(arr2));

    }
}
