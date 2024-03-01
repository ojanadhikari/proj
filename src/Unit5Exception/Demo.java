package Unit5Exception;

import java.util.Scanner;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-28
 **/
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dividend");;
        int a = scanner.nextInt();
        System.out.println("Enter divisor");;
        int b = scanner.nextInt();
        try {
            double c = divide(a, b);
            System.out.println(c);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Operation Completed");
        }
    }

    public static double divide(int a, int b) throws MyException {
        if(b==0){
            throw new MyException("Divisor cannot be zero");
        }
        return a/b;
    }
}
