package Unit3and4OOP.abstractex;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-20
 **/
public class Child extends MyAbstractClass{
    @Override
    void hi() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.hello();
        child.hi();
    }
}
