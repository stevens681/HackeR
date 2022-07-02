import java.util.List;

public class TwoDArrayDS {
    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        int  res = Integer.MIN_VALUE;
        int row = arr.size(), column = arr.get(0).size();

        for(int rowIndex = 0; rowIndex< row-2; rowIndex++){
            for(int columnIndex = 0; columnIndex < column -2; columnIndex++){

                int sum = (arr.get(rowIndex).get(columnIndex) + arr.get(rowIndex).get(columnIndex+1)+
                        arr.get(rowIndex).get(columnIndex+2)) + (arr.get(rowIndex+1).get(columnIndex+1))
                        +(arr.get(rowIndex+2).get(columnIndex)+ arr.get(rowIndex+2).get(columnIndex+1))
                        +(arr.get(rowIndex+2).get(columnIndex+2));

                res = Math.max(res, sum);
            }
        }

        return res;
    }



    public static void main(String[] args) {

    }
}
