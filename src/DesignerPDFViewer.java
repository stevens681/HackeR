import java.util.ArrayList;
import java.util.List;

public class DesignerPDFViewer {


    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int res =0;
        char[] l = word.toCharArray();

        for(int i=0; i<l.length; i++){
            int valueChar= Character.getNumericValue(l[i]) - 10;
            if(h.get(valueChar)>res)
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
