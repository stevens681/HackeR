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
        HashSet<Integer> listA = new HashSet<>(a);
        HashSet<Integer> listB = new HashSet<>(b);

        // if(Collections.min(a)<=1&&Collections.max(b)>=10)
        //     return res;
        // if(Collections.max(a)==Collections.min(b))
        //     return res;
        for(int i=Collections.max(listA); i<=Collections.min(listB); i++) {
            boolean flagA=false, flagB=false;

            for (Integer numB : listB) {
                if (numB % i == 0) {
                    flagB = true;

                }

            }
            for (Integer numA : a) {
                if (numA % i == 0) {
                    flagA=true;

                }
            }
            if(flagA&&flagB)res++;
        }

        return res;

    }


    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(2);
//        a.add(4);

        List<Integer> b = new ArrayList<>();
        b.add(20);
        b.add(30);
        b.add(12);

        System.out.println(getTotalX(a,b));


//    2 4
//16 32 96


    }

//        int n=48;
//        for(int i=1; i <= n; i++) {
//            if(n % i == 0) {
//                if(i%1==0){
//                    System.out.print(i + "Division");
//                }
//                System.out.print(i + "\t");
//            }
//            System.out.println(i + "\t");
//        }
//    }
}
