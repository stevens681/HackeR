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

        List<Integer> res = new ArrayList<>();  //To hold the result.

        //Loops the list
        do {
            res.add(arr.size());    //Adds to the list
            int shortStick = Collections.min(arr);  //Minimum value of list.
            arr.removeAll(Collections.singleton(shortStick));   //Removed the all the short sticks.

            //Iterate the list once more and modifies the result.
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) - shortStick);
            }
        } while (arr.size() >= 1);

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
