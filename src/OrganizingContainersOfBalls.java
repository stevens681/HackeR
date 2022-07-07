import java.util.ArrayList;
import java.util.List;

public class OrganizingContainersOfBalls {
    /*
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here

        return "";
    }
    public static void main(String[] args) {
        String list = """
                1 3 1
                2 1 2
                3 3 3""";
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
        System.out.println(organizingContainers(arr));
    }
}
