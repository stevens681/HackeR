import java.util.ArrayList;
import java.util.List;

public class FormingAMagicSquare {
    public static void main(String[] args) {
        List<List<Integer>> s = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al1.add(4);
        al1.add(8);
        al1.add(2);

        al2.add(4);
        al2.add(5);
        al2.add(7);

        al3.add(6);
        al3.add(1);
        al3.add(6);

        s.add(al1);
        s.add(al2);
        s.add(al3);
//        4 8 2
//        4 5 7
//        6 1 6
        int[][][] all = {
                { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
                { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
                { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
                { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
                { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
                { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
                { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
                { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },
        };
        int min = 9;
        for (int i =0; i<8; i++){
//            for(int j=0; j<3; j++){
//                for(int k=0; k<3; k++){
//                    System.out.print(all[i][j][k]+"\t");
//                }
//                System.out.println();
//            }
//            System.out.println("\n");
            int x = findMinimumFromMS(s, all[i]);
            if (x < min)
                min = x;

            System.out.println(x);

        }
        System.out.println(min+"\tThis is the result");
    }
    public static int findMinimumFromMS(List<List<Integer>> arr,
                                        int[][] ms)
    {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < 3; j++) {


                if (arr.get(i).get(j) != ms[i][j]) {
//                    System.out.println(arr.get(i).get(j));
//                    System.out.println(ms[i][j]);
                    count = Math.abs(arr.get(i).get(j)-ms[i][j]);
                    //count++;
                }
            }
        }
        return count;
    }

}
