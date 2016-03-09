import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by robertsg on 3/8/2016.
 */
public class Variables {
    public static void main(String[] args) {
        String firstName = "Glen";
        String secondName = "Roberts";

        int firstNameLength = firstName.length();
        int secondNameLength = secondName.length();

        System.out.println("My name is " + firstName + " " + secondName);
        System.out.println("With your name having " + (firstNameLength + secondNameLength) +  " characters");

    }
}
