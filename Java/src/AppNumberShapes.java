import java.util.Scanner;

/**
 * Created by robertsg on 3/8/2016.
 * Input a Number
 * Determine if number is a square, triangular, both, neither
 */
public class AppNumberShapes {
    public static void main(String[] args) {
        testNumber();
    }

    public static void testNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        while (sc.hasNextInt()) {
            int inputNumber = sc.nextInt();
            if (isItSquare(inputNumber) && isItTriangular(inputNumber)) {
                System.out.println("This number is square and triangular!");
            } else if (isItSquare(inputNumber)) {
                System.out.println("This number is square");
            } else if (isItTriangular(inputNumber)) {
                System.out.println("This number is triangular");
            } else {
                System.out.println("This number is neither square or triangular");
            }
        }
    }

    public static boolean isItSquare(int num) {
        double squareRoot = Math.sqrt(num);
        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isItTriangular(int num) {
        int x = 1;
        int triangularNumber = 1;
        while (triangularNumber < num) {
            x++;
            triangularNumber = triangularNumber + x;
        }
        if (triangularNumber == num) {
            return true;
        } else {
            return false;
        }
    }
}

