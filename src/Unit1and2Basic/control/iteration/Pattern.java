package Unit1and2Basic.control.iteration;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-13
 **/
public class Pattern {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            char a = 97;
            for(int j=0;j<i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
