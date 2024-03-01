package Unit1and2Basic.control;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class DiamondPattern {
    public static void main(String[] args) {
        int number = 7;
        int m, n;
        for (m = 1; m <= number; m++) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (m = number - 1; m > 0; m--) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
