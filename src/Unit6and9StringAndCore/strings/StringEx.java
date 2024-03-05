package Unit6and9StringAndCore.strings;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-03
 **/
public class StringEx {
    public static void main(String[] args) {

        //creation
        char[] s = {'h', 'e', 'l', 'e', 'o'};

        String st1 = new String(s);
        String st2 = new String("hello");
        String st3 = "hello";
        String st4 = "hello";

        //comparison

        System.out.println(st3 == st4);
        System.out.println(st1 == st3);
        System.out.println(st1 == st2);
        System.out.println(st3 == st2);

        System.out.println(st3.equals(st4));
        System.out.println(st3.equals(st1));
        System.out.println(st3.equals(st2));

        //length
        String str = "hello";
        System.out.println(str.length());

        //concat
        String age = "9";
        System.out.println(str + age);

        System.out.println(str + 2 + 2);
        System.out.println(str + (2 + 2));

        String test = "gr" +
            "sad" +
            "dsad";

        //conversion

        int a = 9;
        double b = 9.0;
        boolean c = true;
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(c));

        String ts = "99.99";
        double d = Double.parseDouble(ts);
        System.out.println(d);

        String cases = "Hello";
        System.out.println(cases.toLowerCase());
        System.out.println(cases.toUpperCase());

        //extraction

        String ext = "This is a fish which tastes rubbish";
        System.out.println(ext.charAt(3));

        //search

        System.out.println(ext.indexOf('h'));
        System.out.println(ext.lastIndexOf('h'));

        System.out.println(ext.lastIndexOf("sh",8));
        System.out.println(ext.indexOf('h',8));
        System.out.println(ext.lastIndexOf('h',8));
        System.out.println(ext.indexOf("sh"));
        System.out.println(ext.lastIndexOf("sh"));
        System.out.println(ext.indexOf("sh",8));


    }
}
