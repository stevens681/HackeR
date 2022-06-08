import javax.sound.midi.Soundbank;

public class CatsAndAMouse {
    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        String str="";
        int aToC =Math.abs(x-z), bToC=Math.abs(y-z);
        if(aToC==bToC)str="Mouse C";
        else if(aToC<bToC){
            str = "Cat A";
        }
        else
            str = "Cat B";
        return str;



    }
    public static void main(String[] args) {
        System.out.println(catAndMouse(2, 5, 4));
        System.out.println(catAndMouse(2,1,3));
        System.out.println(catAndMouse(1,3,2));
    }
}
