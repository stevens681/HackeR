public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int result=0, v=0;
        char[] level = path.toCharArray();

        for(int i=0; i<steps; i++){
            if(level[i]=='U')
                v++;
            else
                v--;
            if(v==0&&level[i]=='U')result++;
        }


        return result;

    }
    public static void main(String[] args) {
        String path ="DDUUDDUDUUUD";
        int steps= path.length();

        System.out.println(CountingValleys.countingValleys(steps, path));

        path="UDDDUDUU";
        steps= path.length();

        System.out.println(CountingValleys.countingValleys(steps, path));
    }
}
