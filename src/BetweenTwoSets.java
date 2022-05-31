import java.util.List;

public class BetweenTwoSets {

//    public static int getTotalX(List<Integer> a, List<Integer> b){
//
//    }
    public static void main(String[] args) {

        int n=48;
        for(int i=1; i <= n; i++) {
            if(n % i == 0) {
                if(i%1==0){
                    System.out.print(i + "Division");
                }
                System.out.print(i + "\t");
            }
            System.out.println(i + "\t");
        }
    }
}
