public class ViralAdvertising {
    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        // Write your code here
        int res=0, p =5;
        for(int i=0; i<n; i++){
            p = (int) Math.floor(p/2);
            res += p;
            p *= 3;
        }
        return res;


    }
    public static void main(String[] args) {
        System.out.println(viralAdvertising(50));

    }
}
