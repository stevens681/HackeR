public class ViralAdvertising {
    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        // Write your code here
        int res = 0, p = 5;    //Result and pages.
        final int FRIENDS = 3;  //Constant friend.
        //Iterates the numbers
        for(int i=0; i<n; i++){
            p = (int) Math.floor(p/2);  //Rounds down the division.
            res += p;   //Add the result.
            p *= FRIENDS;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(viralAdvertising(50));

    }
}
