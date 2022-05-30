import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BreakingTheRecords {
    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        System.out.println(scores);

        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        int min=scores.get(0), max=scores.get(0);
        for(int i=1; i<scores.size(); i++){

            if(scores.get(i)>max){
                max=scores.get(i);
                result.set(0, result.get(0)+1);

            }

            if(scores.get(i)<min){
                min=scores.get(i);
                result.set(1, result.get(1)+1);

            }


        }

        return result;

    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        Random n=new Random();
        for(int i=0; i<10; i++){
            arr.add(n.nextInt(100));
        }
        //System.out.print(arr);
        System.out.println(breakingRecords(arr));



    }
}
