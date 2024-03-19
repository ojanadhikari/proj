package Unit6and9StringAndCore;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-05
 **/
public class Diction {
    public static void main(String[] args) {
        Dictionary<Integer,String> dictionary = new Hashtable<>();
        dictionary.put(1,"Ram");
        dictionary.put(2,"Shyam");
        dictionary.put(3,"Sita");
        System.out.println(dictionary.size());
        System.out.println(dictionary.get(2));
        System.out.println(dictionary.remove(2));
        System.out.println(dictionary.size());



    }
}
