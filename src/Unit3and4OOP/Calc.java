package Unit3and4OOP;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class Calc {
    int a;
    int b;
    int sum;
    int sum(){
        a=10;
        b=20;
        sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        int sum = calc.sum();
        System.out.println("Sum="+sum);
    }
}
