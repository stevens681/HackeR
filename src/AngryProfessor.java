import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {
    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        String res = "";
        int yes = 0, no=0;
        for(Integer i: a){
            if(i<=0)yes++;
            else no++;
        }
        if(yes>=k){
            res ="NO";
        }
        else res="YES";

        return res;

    }
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(-3);
        arr.add(4);
        arr.add(2);

        System.out.println(angryProfessor(2,arr));

    }
}
