public class NumberLineJumps {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String str = "";
//        int vDif = v1-v2;
//        if(vDif<=0){
//            str ="NO";
//        }
//        int xDif= x1-x2;
//        str = xDif%vDif ==0 ? "YES" : "NO";

        if(x1<x2 && v1<v2){
            str="NO";

        }
        else if(v1 != v2 && (x1-x2)%(v2-v1)==0)
                str="YES";
        else
            str="NO";


        return str;





    }


    public static void main(String[] args) {
        System.out.println("Case1 "+kangaroo(2,1,1,2));

        System.out.println("Case2 "+kangaroo(0,3,4,2));

        System.out.println("Case3 "+kangaroo(0,2,5,3));

        System.out.println("Result "+NumberLineJumps.kangaroo(0,1,0,0));

    }
}
