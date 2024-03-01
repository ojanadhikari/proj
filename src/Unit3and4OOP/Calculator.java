package Unit3and4OOP;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class Calculator {
    int sum;
    int add(int a , int b){
        sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        System.out.println("sum=" + sum);
    }
}
