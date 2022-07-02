import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BirthdayCakeCandles {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int nc = 0, hold=0; //The result and the hold

        //Walks the list
        for (Integer candle : candles) {

            //If candle is larger than hold.
            if (candle > hold) {
                hold = candle;  //Transfer hold to candle.
                nc = 0;
            }

            //If the candle is equal to the hold and not 0.
            if (candle == hold && candle != 0)
                nc++;   //Counts the result.
        }

        return nc;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random n=new Random();
        for(int i=0; i<300; i++){
            arr.add(n.nextInt(10)+1);
        }

        System.out.println(BirthdayCakeCandles.birthdayCakeCandles(arr));

    }
}
