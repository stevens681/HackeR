import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

//    public static int getTotalX(List<Integer> a, List<Integer> b){
//
//    }
public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int res=0;
    int aLast = a.get(a.size()-1), bFirst=b.get(0);
    for(int i=aLast; i<=bFirst; i++){
        for(Integer j: b){
            if(flag(i,j)) {
                System.out.print(i);
                break;
            }
        }
       for (Integer l: a){
           if(i%l==0) {
               System.out.println("\t"+i);
               break;
           }
       }

    }
    return res;

}
private static boolean flag(int a, int b){
    boolean f=false;
    if(b%a==0) {
        f=true;
    }
    return f;

}


    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);

        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);

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
