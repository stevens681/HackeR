

public class Staircase {
    public static void staircase(int n) {
        // Write your code here
        for(int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                System.out.print(" ");

            }
            for(int j=0; j<=i; j++){
                System.out.print("#");

            }

            System.out.println();
        }


    }


    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        for(int i=0; i<60; i++){

        }
        Staircase.staircase(900);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));

    }
}
