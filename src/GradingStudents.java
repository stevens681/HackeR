import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        for(Integer g: grades){
            if(g < 38)continue;
            int newGrade = (g/5+1)*5;

            if((newGrade-g)<3){
                grades.set(grades.indexOf(g), newGrade);
            }
        }

        return grades;

    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        Random n=new Random();
        for(int i=0; i<10; i++){
            arr.add(n.nextInt(100));
        }
        System.out.print(arr);

        GradingStudents.gradingStudents(arr);
        for(int i= 0; i<arr.size(); i++){
            //if(arr.get(i) !=result.get(i))
                System.out.print(arr.get(i) +"\n");
        }




    }
}
