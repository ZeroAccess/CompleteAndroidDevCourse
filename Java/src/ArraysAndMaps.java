import java.util.*;

/**
 * Created by robertsg on 3/8/2016.
 */
public class ArraysAndMaps {

    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("US");
        list.add("Canada");
        list.add("Mexico");
        list.remove(2);
        list.add("France");

        System.out.println(list.toString());

        Map map = new HashMap();
        map.put("Father", "Glen");
        map.put("Son", "Calix");

        System.out.println(map.get("Father"));
        System.out.println(map.toString());
    }
}
