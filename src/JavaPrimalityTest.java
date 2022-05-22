import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        String n ="13";
        BigInteger i = new BigInteger(n);
        System.out.println(i.isProbablePrime(10) ? "prime" : "not prime");
    }
}
