package Unit10Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-18
 **/
public class HM {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(1,"one");

        System.out.println(map.get(1));

        for (Integer i : map.keySet()){
            System.out.println("Values=" +map.get(i));
        }
    }
}
