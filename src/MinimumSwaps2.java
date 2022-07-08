public class MinimumSwaps2 {
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int res = 0, i=0, n=arr.length, temp=0;

        while(i<n){

            if(arr[i] != i+1){
                temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
                res++;
            }
            else{
                i++;
            }
        }
        return res;


    }

    public static void main(String[] args) {
        int[] arr1 = {7, 1, 3, 2, 4, 5, 6}, arr2 ={1,3,5,2,4,6,7};
        System.out.println(minimumSwaps(arr1));
        System.out.println(minimumSwaps(arr2));

    }
}
