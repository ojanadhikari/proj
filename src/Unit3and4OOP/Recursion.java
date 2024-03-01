package Unit3and4OOP;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class Recursion {
    int factorial(int n){
        int result;
        if(n==1) return 1;
        result = factorial(n-1)*n;
        return result;
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println("4!="+recursion.factorial(4));
    }
}

