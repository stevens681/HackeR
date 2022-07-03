import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheCloudsSimple {
    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int res = 0;    //Holds the result

        //Walks the list.
        //Minus 1 so it doesn't reach the end
        for(int i = 0; i<c.size()-1; i++){

            if(c.get(i) == 0)i++;   //If is 0 advance.
            res++;  //How many jumps
        }

        return res;

    }
    public static void main(String[] args) {

        String list = "0 0 1 0 0 1 0";

        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;

            arr.add(Character.getNumericValue(i));

        }
        System.out.println(jumpingOnClouds(arr));

    }
}
