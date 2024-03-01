package Unit3and4OOP.abstraction;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-17
 **/
public class Child extends AbsParent{

    @Override
    void hello() {
        System.out.println("Hello form Child");
    }


    public static void main(String[] args) {
        Child child  = new Child();
        child.hello();
        child.hi();
    }
}
