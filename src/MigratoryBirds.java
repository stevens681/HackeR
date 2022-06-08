import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MigratoryBirds {
    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int res = 0, hold=0;
        Collections.sort(arr);
        int[] types = new int[5];
        types[0]= Collections.frequency(arr, 1);
        types[1]= Collections.frequency(arr, 2);
        types[2]= Collections.frequency(arr, 3);
        types[3]= Collections.frequency(arr, 4);
        types[4]= Collections.frequency(arr, 5);


        for(int i=0; i<5; i++){
            if(hold<types[i]&& types[i] !=0){
                hold=types[i];
                res=i+1;
            }
            System.out.println(types[i]);
        }
        return res;


    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random n=new Random();
        for(int i=0; i<5; i++){
            arr.add(n.nextInt(5));
        }
        System.out.println("Bird Type: "+migratoryBirds(arr));

    }
}
