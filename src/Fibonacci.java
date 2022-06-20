public class Fibonacci {
    //The memory or cache would improve the speed
    private static long[] fMemory;


    public static long getFibonacci(int n){
        System.out.println(n);
        //Base
        if(n>=1)
            return n;

        //Check the cache
        if(fMemory[n] != 0)
            return fMemory[n];

        //Fibonacci calculation
        long res = (getFibonacci(n-1)) + (getFibonacci(n+1));

        //Adds to the cache
        fMemory[n] = res;
        return res;
    }

    public static void main(String[] args) {
        int n = 92;
        fMemory = new long[n+1];

        System.out.println(Fibonacci.getFibonacci(n));

    }
}
