import java.util.List;

public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int applesSize = apples.size(), ornagesSize=oranges.size(), applesRange=0, orangesRange=0;

        for(int i=0; i<applesSize; i++){
            if((apples.get(i) + a)>=s && (apples.get(i) + a)<=t)
                applesRange++;
        }
        for(int i=0; i<ornagesSize; i++){
            //System.out.println(oranges.get(i) + a);
            if((oranges.get(i) + b)>=s && (oranges.get(i) + b)<=t)
                orangesRange++;
        }
        System.out.println(applesRange);
        System.out.println(orangesRange);

    }


    public static void main(String[] args) {
        

    }
}
