import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries, int n){
//
//
//        List<Integer> res = new ArrayList<>();
//
//        int dif = k%n;
//        for(int i=0; i<queries.size(); i++){
//            int index = a.get(i);
//            if(index - dif >= 0){
//                res.add(a.get(index - dif));
//
//            }
//            else
//                res.add(index - dif + a.size());
//        }
//
        return a;
//        for(int i=0; i < n; i++){
//            a.get(i) = in.nextInt();
//        }
//        for(int a0 = 0; a0 < q; a0++){
//            int m = in.nextInt();
//            System.out.println(a[(n - (k % n)+ m) % n]);
//        }

    }
    public static void main(String[] args) {

        String list = "3 4 5";
        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;

            arr.add(Character.getNumericValue(i));

        }

        String queries = "1 2";
        List<Integer> q = new ArrayList<>();

        char[] qChar= queries.toCharArray();
        for(Character i: qChar){
            if(i.equals(' ')) continue;

            q.add(Character.getNumericValue(i));

        }
        int n = arr.size(), k = 2;

        System.out.println(circularArrayRotation(arr, k, q, n));


    }
}
