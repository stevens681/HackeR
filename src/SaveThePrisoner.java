public class SaveThePrisoner {
    /*
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        int res =0;
        for(int i =0; i<m; i++){

            res =((m - 1) + (s - 1)) % n + 1;
        }

        return res;
    }
    public static void main(String[] args) {

        System.out.println(saveThePrisoner(5, 2, 2));

    }
}
