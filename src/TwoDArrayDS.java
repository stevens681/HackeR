import java.util.ArrayList;
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
        String list = """
                1 1 1 0 0 0
                0 1 0 0 0 0
                1 1 1 0 0 0
                0 0 2 4 4 0
                0 0 0 2 0 0
                0 0 1 2 4 0""";
//        String list = """
//                -9 -9 -9  1 1 1
//                 0 -9  0  4 3 2
//                -9 -9 -9  1 2 3
//                 0  0  8  6 6 0
//                 0  0  0 -2 0 0
//                 0  0  1  2 4 0""";

        List<List<Integer>> arr = new ArrayList<>();

        String[] split = list.split("\n");

        for(int i = 0; i<list.split("\n").length; i++){

            String[] space = split[i].split("\\s");
            List<Integer> hold = new ArrayList<>();
            for (String s : space) {
                hold.add(Integer.parseInt(s));
            }
            if(!hold.isEmpty())
                arr.add(hold);

        }
        System.out.println(hourglassSum(arr));

    }
}
