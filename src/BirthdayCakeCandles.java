import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Random;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int nc = 0, n=candles.size(), hold=0;
        for(int i=0; i<n; i++){
            if(candles.get(i)>hold){
                hold = candles.get(i);
                nc=0;
            }
            if(candles.get(i)==hold&&candles.get(i)!=0)
                nc++;

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
