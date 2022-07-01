public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int res = 100, n = c.length, i = k%n;

        while(i != 0){
            if(c[i]==1)
                res -=2;
            res--;
            i = (i+k) % n;
        }
        if(c[0]==1){
            res -=3;
        }
        else
            res--;
        return res;

    }

    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 0, 0, 1, 1, 0};
        int k =2;

        System.out.println(jumpingOnClouds(arr, k));


    }
}
