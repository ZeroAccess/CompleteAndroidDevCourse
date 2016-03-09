import java.util.ArrayList;
import java.util.List;

/**
 * Created by robertsg on 3/8/2016.
 */
public class Loops {
    //Display first 10 multiples of 3
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int j;

        while(x < 11) {
            y = x * 3;
            System.out.println(x + ": multiple of 3 is " + y);
            x++;
        }

        for(int i = 0;i<11;i++) {
            j = i*(i + 1)/2;
            System.out.println(i + ": triangle number is " + j);
        }

        String[] anArray = {"Glen","Calix","Cindy","Grace"};

        for(String name: anArray) {
            System.out.println(name);
        }

        List<String> aList = new ArrayList<String>();

        aList.add("Calix");
        aList.add("Glen");

        for (String name:aList) {
            System.out.println(name);
        }


    }



    //Display first 10 triangular numbers
}
