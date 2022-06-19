public class BeautifulDaysAtTheMovies {
    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int res=0, range=j-i;
        for(int count=0; count<=range; count++){

            if(((i+count)-reverseNum(i+count)) % k ==0)
                res++;
        }

        return res;
    }

    public static int reverseNum(int n){
        int reversed=0;
        while(n != 0) {

            int digit = n % 10;
            reversed = reversed * 10 + digit;

            n /= 10;
        }
        return reversed;
    }


    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));

    }
}
