import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class BetweenTwoSets {

//    public static int getTotalX(List<Integer> a, List<Integer> b){
//
//    }
    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int res = 0;

       // System.out.println(LcmOfArray(a, 0));

//        System.out.println(gcd(LcmOfArray(b, 0), ));
        //for(int i =1; )
        int low=Collections.min(b);
        //System.out.println(low);
        for(int i=1; i<b.size(); i++){
//
            if(gcd(b.get(i-1) , b.get(i))<low){
                low = gcd(b.get(i), b.get(i - 1));
            }
        }
        int h=LcmOfArray(a, 0);
        System.out.println(low+" " +h);
        for(int i=h; i<=low; i++){
            if(low % i == 0 && i%2==0){
                System.out.println(i);
                res++;
            }
        }

        return res;

    }
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
        return b == 0? a:gcd(b, a % b);
    }

    // recursive implementation
    static int LcmOfArray(List<Integer> arr, int idx)
    {

        // lcm(a,b) = (a*b/gcd(a,b))
        if (idx == arr.size() - 1){
            return arr.get(idx);
        }
        int a = arr.get(idx);
        int b = LcmOfArray(arr, idx+1);
        return (a*b/gcd(a,b));
    }


    public static void main(String[] args) {
//        2
//        20 30 12
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);

        List<Integer> b = new ArrayList<>();
        b.add(48);
        b.add(24);
//        b.add(12);

        System.out.println(getTotalX(a,b));



    }


}

/**
 1. Find LCM of the first array a. 2.Find GCD / HCF of the second array b.
 3.Find all the multiples of LCM up to GCD, which divides the GCD evenly.

 */
