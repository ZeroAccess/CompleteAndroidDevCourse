import java.lang.reflect.Array;

/**
 * Created by robertsg on 3/8/2016.
 */
public class IfStatements {
    public static void main(String[] args) {
        int[] anArray = {11,11};

        if(anArray[0] > anArray[1]) {
            System.out.println(anArray[0] + " is greater than " + anArray[1]);
        }else if (anArray[0] < anArray[1]){
            System.out.println(anArray[0] + " is less than " + anArray[1]);
        }else{
            System.out.println("The numbers are the same");
        }
    }
}
