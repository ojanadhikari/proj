package Unit6and9StringAndCore.wrappper;


/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-17
 **/
public class Wrapper {
    public static void main(String[] args) {
        Integer i =1;
        Double d =1.0;
        Boolean b= true;
        Character c = 'c';

        String s = "Hello";
        String s1 = "hello";
        System.out.println(s.equals(s1));
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(3));
        System.out.println(s.toLowerCase());

        String t = "            hello ";
        System.out.println(t);
        System.out.println(t.trim());
        String a = "1";
        String adfw = "3.55";
        Double fdsf = Double.parseDouble(adfw);
        System.out.println(fdsf);
        Integer v = Integer.parseInt(a);
        System.out.println(1);

        String xy ="1";
        String cv = "1";

        Integer sa = Integer.parseInt(xy);
        Integer av = Integer.parseInt(cv);

        System.out.println(xy+cv);
        System.out.println(sa+av);

    }
}
