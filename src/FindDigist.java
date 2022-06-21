public class FindDigist {
    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
        // Write your code here
        int res=0;
        String temp= Integer.toString(n);
        char[] d = temp.toCharArray();

        for(int i=0; i<d.length; i++){
            int t=Character.getNumericValue(d[i]);

            if( t!=0 && n%(t%10) ==0){

                res++;
            }
        }
        return res;

    }


    public static void main(String[] args) {
        System.out.println(findDigits(12));
    }
}
