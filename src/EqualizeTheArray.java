import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EqualizeTheArray {
    /*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int res =0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer i: arr){
            if(map.containsKey(i)){
                int mapValue = map.get(i);
                map.put(i, mapValue+=1);
            }
            else{
                map.put(i, 1);
            }
            if(map.get(i)>res){
                res = map.get(i);
            }
        }
        res = arr.size() - res;

        return res;

    }


    public static void main(String[] args) {

        String list = "3 3 2 1 3";
        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;

            arr.add(Character.getNumericValue(i));

        }

        System.out.println(equalizeArray(arr));

    }
}
