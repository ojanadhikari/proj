package Unit6and9StringAndCore;

import java.util.Vector;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-05
 **/
public class Vec {

    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3);
        integers.add(2);
        System.out.println(integers.size());
        System.out.println(integers.get(0));
        System.out.println(integers.isEmpty());
        integers.remove(2);
        System.out.println(integers.size());
//        integers.clear();
//        System.out.println(integers.size());
        System.out.println(integers.indexOf(2));
        System.out.println(integers.lastIndexOf(2));

    }
}
