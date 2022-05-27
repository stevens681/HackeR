import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    public static String timeConversion(String s){
        // Write your code here
        DateFormat f= new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outF= new SimpleDateFormat("HH:mm:ss");

        try{
            Date date=f.parse(s);
            s=outF.format(date);
        }catch(ParseException exception){
            exception.getMessage();
        }

        return s;

    }
    public static void main(String[] args) {
       System.out.println( TimeConversion.timeConversion("07:05:45PM"));


    }
}
