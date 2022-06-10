public class UtopianTree {
    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
        // Write your code here
        int res = 0;

        for(int i = 0; i<=n; i++){
            if(i%2==0){
                res++;
            }else{
                res = res+res;
            }
            System.out.println(res);
        }

        return res;

    }


    public static void main(String[] args) {
        System.out.println(utopianTree(20));

    }
}
