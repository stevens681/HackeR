import java.util.List;

public class ApplesAndOranges {
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int applesRange=0, orangesRange=0;  //Holds the counts for the apples and oranges

        //Walks the apples list
        for (Integer apple : apples) {
            if ((apple + a) >= s && (apple + a) <= t)   //Does the calculation for the apples distances.
                applesRange++;  //Counts the apple's ranger.
        }

        //Walks the oranges list
        for (Integer orange : oranges) {
            if ((orange + b) >= s && (orange + b) <= t) //Does the calculation for the oranges distances.
                orangesRange++;   //Counts the orange's ranger.
        }

        //Shows the answers
        System.out.println(applesRange);
        System.out.println(orangesRange);

    }


    public static void main(String[] args) {
        

    }
}
