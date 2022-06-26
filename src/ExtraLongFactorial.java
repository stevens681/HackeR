import java.math.BigInteger;

public class ExtraLongFactorial {
    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger extraLongFact = BigInteger.ONE;

        for(int i = 1; i<=n; i++){
            extraLongFact= extraLongFact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(extraLongFact);

    }
    public static void main(String[] args) {
        extraLongFactorials(35);

    }
}
