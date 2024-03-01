package Unit3and4OOP.polymorphism;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-17
 **/
public class Child extends Parent{

    void hello(){
        System.out.println("Hello form child");
    }

    public static void main(String[] args) {
//        Parent parent = new Parent();
//        parent.hello();
//        parent.hi();

        Child child = new Child();
        child.hello();
        child.hi();

    }
}
