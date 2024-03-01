package Unit3and4OOP.abstraction;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-19
 **/
public class Main {
    public static void main(String[] args) {
        Inter1 obj = new Child1();
        obj.hello();
        obj.hi();

        Inter1 obj2 = new Child2();
        obj2.hello();
        obj2.hello();
    }
}
