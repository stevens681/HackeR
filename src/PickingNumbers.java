import java.util.ArrayList;
import java.util.List;

public class PickingNumbers {
     /* Complete the 'pickingNumbers' function below.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int temp;    //Holds a temp number.
        int[] holdValue = new int[100]; //Makes an Array to hold values.
        //Walks the a Array.
        for (Integer integer : a) {
            temp = integer;
            if (temp == 0)
                holdValue[0]++;
            else {
                holdValue[temp]++;
                holdValue[temp - 1]++;
            }
        }
        //Holds the max value
        int max = Integer.MIN_VALUE;
        //Find max value.
        for (int j : holdValue) {
            if (j > max)
                max = j;
        }
        return max;
    }

    public static void main(String[] args) {
        String list = "1 2 2 3 1 2";
        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;
            arr.add(Character.getNumericValue(i));
        }
        System.out.println(pickingNumbers(arr));


    }
}
