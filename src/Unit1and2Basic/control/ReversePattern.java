package Unit1and2Basic.control;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class ReversePattern {
    public static void main(String[] args) {
        int k = 5;
        for (int a = 0; a <= k; a++) {
            for (int b = 1; b <= k - a; b++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= a; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
