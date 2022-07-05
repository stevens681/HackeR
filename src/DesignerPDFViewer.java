import java.util.ArrayList;
import java.util.List;

public class DesignerPDFViewer {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int res =0; //Holds the result.
        char[] l = word.toCharArray();  //Breaks the word into characters.

        //Iterate the characters.
        for (char c : l) {
            //Get the numeric value for the character.
            int valueChar = Character.getNumericValue(c) - 10;
            //Checks the numeric value
            if (h.get(valueChar) > res)
                res = h.get(valueChar);
        }
        res=word.length()*res;

        return res;
    }

    public static void main(String[] args) {
        String list = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5";
        String word = "abc";
        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;

            arr.add(Character.getNumericValue(i));

        }
        System.out.println(designerPdfViewer(arr, word));


    }
}
