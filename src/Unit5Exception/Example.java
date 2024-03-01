package Unit5Exception;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-17
 **/
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dividend");
        int a = scanner.nextInt();
        System.out.println("Enter divisor");
        int b =scanner.nextInt();
        try {
            double res = divide(a, b);
            System.out.println(res);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Operation completed");
        }
    }

    static int divide(int a , int b) throws RuntimeException {
        if(b==0){
            throw new RuntimeException("Divisor cannot be zero");
        }
        return  a/b;
    }
}

