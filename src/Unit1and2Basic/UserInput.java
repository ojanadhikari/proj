package Unit1and2Basic;

import java.util.Scanner;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a  = sc.nextInt();
        if(a%3==0 && a%5==0) System.out.println("Both");
        else if(a%3==0) System.out.println("3");
        else if(a%5==0)System.out.println("5");
        else    System.out.println("None");
    }
}
