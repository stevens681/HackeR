import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BillDivision {
    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int sum=0;  //Hold the result

        //Walks the bill
        for(int i=0; i<bill.size(); i++){
            if(k==i)continue;   //If the bill is the same skip this interaction.
            sum+=bill.get(i);   //Sums the bill.
        }

        double split = sum/2;   //Split the bill in half

        //Rounds it up and prints the bill message.
        if(b==Math.round(split))
            System.out.println("Bon Appetit");
        else
            System.out.println(b-Math.round(split));
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random n=new Random();
        for(int i=0; i<4; i++){
            arr.add(n.nextInt(100));
        }

        BillDivision.bonAppetit(arr, n.nextInt(100),n.nextInt(100));

    }
}
