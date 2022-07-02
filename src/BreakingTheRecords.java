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
        //This is the list that it holds the result.
        List<Integer> result = new ArrayList<>();
        result.add(0);  //Initializes the list.
        result.add(0);
        int minimalScores=scores.get(0), maximumScores=scores.get(0);   //Holds the first score in the list
        //Walks the list starting from index 1
        for(int i=1; i<scores.size(); i++){

            //Checks for maximum scores
            if(scores.get(i)>maximumScores){
                maximumScores=scores.get(i);
                result.set(0, result.get(0)+1); //Modifies the list result

            }

            //Checks for minimum scores
            if(scores.get(i)<minimalScores){
                minimalScores=scores.get(i);
                result.set(1, result.get(1)+1); //Modifies the list result

            }
        }
        return result;

    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        Random n=new Random();
        for(int i=0; i<10000; i++){
            arr.add(n.nextInt(100));
        }
        System.out.println(arr);
        System.out.println(breakingRecords(arr));



    }
}
