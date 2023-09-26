package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
// Arrays
       String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Starday", "Sunday"};
        System.out.println(Arrays.toString(days));
        System.out.println(days[0]);
        Arrays.sort(days);
        System.out.println(Arrays.toString(days));

        String [] subjectArray = createSubjectsArray();
        System.out.println(subjectArray[2]);
        System.out.println(subjectArray.length);



        // for loop

        for (int i = 0; i < days.length; i++){
          if (days[i].equals("Sunday")) continue; // jump this word

            System.out.print(days[i]+ " ");
            if (days[i].equals("Tuesday")) break;

        }
        System.out.println();
        int [] evenNum = new int [51];
        int j =0;
        for (int i = 0; i <= 100; i++){
            if (i % 2 ==0){
                evenNum[j]= i;
                j++;
            }
        }
        System.out.println(Arrays.toString(evenNum));


        // foreach loop

        for (int i : evenNum){
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        int counter =0;
        while (counter < evenNum.length){
            counter++;
        }
        System.out.println(counter);

        // Do while loop
counter=0;
do {
    counter++;
} while (counter< evenNum.length);
        System.out.println(counter);

// ArrayList
        List <String> countries = new ArrayList<>();
        countries.add("saudi");
        countries.add("Spain");


        // math class
        System.out.println(Math.sqrt(64));
        System.out.println((int)Math.pow(2, 5));
    }


    public static String [] createSubjectsArray(){
        String [] subjects = new String [5];
        subjects[0]= "math";
        subjects[1]= "Language";
        subjects[2]= "History";
        subjects[3]= "Biology";
        subjects[4]= "Chemistry";

        return subjects;
    }
}
