import java.util.List;

public class SubarrayDivision {
    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int result = 0;
        for(int i=0; i<s.size()-m+1; i++){
            int hold=0;
            for(int j=i; j<i+m; j++){
                // if(i+1 != s.size())
                hold +=s.get(j);

            }
            if(hold==d)result++;
        }
        return result;


    }
    public static void main(String[] args) {


    }
}
