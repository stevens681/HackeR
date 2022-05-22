import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.size(), less=0, more=0, equal=0;
        double result;
        for(int i=0; i<n; i++){
            if(arr.get(i)<0)less++;
            if(arr.get(i)==0)equal++;
            if(arr.get(i)>0)more++;
        }
        result=(double)more/n;
        System.out.printf("%.06f\n", result);
        result=(double)less/n;
        System.out.printf("%.06f\n", result);
        result=(double)equal/n;
        System.out.printf("%.06f\n", result);

    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<6; i++){
            arr.add(i+1);
        }

        PlusMinus.plusMinus(arr);

    }
}
