
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here


        long min = 0, max=0;
        if(arr.size()>=1 && arr.size() <=Math.pow(10, 9)){
            for(long i : arr){
                long hold=0;
                for(long a: arr){
                    hold =hold+a;
                }

                hold = hold-i;
                if(hold>max)max=hold;
                if(hold<min||min<=0)min=hold;

            }

            System.out.println(min+" "+max);
        }
    }


    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<60; i++){
            arr.add(i+1);
        }

        Test.miniMaxSum(arr);


    }

}
