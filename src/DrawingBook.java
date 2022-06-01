public class DrawingBook {
    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        // Write your code here
        int r=0, foward=0, back=0;
        boolean f =n%2==0;

        for(int i=0; i<n+1; i+=2){

            if(p==i || p==i+1)
                break;

            foward++;

        }

        for(int i=0; i<n+1; i+=2){

            if(f){
                if(Math.abs(i-n)==p || p== (Math.abs(i-n)+1))
                    break;
            }

            else{
                if(Math.abs((i+1)-n)==p || p == (Math.abs(i-n)))
                    break;
            }

            back++;
        }

        r = Math.min(foward, back);
        return r;

    }


    public static void main(String[] args) {

       // System.out.println(DrawingBook.pageCount(5,9));

        //System.out.println(DrawingBook.pageCount(1990,4000));
        final long startTime = System.currentTimeMillis();
        int t=DrawingBook.pageCount(1990000,40000000);
        final long endTime = System.currentTimeMillis();
        System.out.println(t);
        System.out.println("Total execution time: " + (endTime - startTime));
    }
}
