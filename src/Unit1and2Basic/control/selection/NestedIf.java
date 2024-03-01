package Unit1and2Basic.control.selection;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-12
 **/
public class NestedIf {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        if(a==10){
            if(b!=20){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}
