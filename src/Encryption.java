public class Encryption {
    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String encryption(String s) {
        // Write your code here
        StringBuilder res = new StringBuilder();
        //Gets rid of the spaces.
        s = s.replaceAll(" ", "");
        //Get the root square of the length of the string.
        double root = Math.sqrt(s.trim().length());
        //Holds the rows and the columns.
        int row = (int)Math.floor(root), column = (int)Math.ceil(root);
        //Split the string into a string array.
        String[] split = s.split("");
        //Checks if the multiple of columns and rows are less than length.
        if(row*column<split.length)
            row = (int)Math.ceil(root);
        //Loops the column length.
        for(int c = 0; c<column; c++){
            //Loops the row length.
            for(int r = 0; r<row; r++){

                int i = c+r*column;
                if(i<split.length)
                    res.append(split[i]);   //Adds the string.
            }
            res.append(" ");    //Adds the space.
        }

        return res.toString();
    }


    public static void main(String[] args) {
        System.out.println(encryption(" if man was meant to stay on the ground god would have given us roots"));
        System.out.println(encryption("haveaniceday"));
        System.out.println(encryption("feedthedog"));

    }
}
