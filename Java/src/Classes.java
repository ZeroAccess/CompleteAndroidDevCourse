/**
 * Created by robertsg on 3/8/2016.
 */
public class Classes {

    public static void main(String[] args) {

        class Number {
            int value;
            public boolean isPositive() {
                if(value > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        Number firstNumber = new Number();
        firstNumber.value = -10;

        if(firstNumber.isPositive()){
            System.out.println(firstNumber.value + " is positive");
        }else {
            System.out.println(firstNumber.value + " is not positive");
        }
    }
}
