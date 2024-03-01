package Unit3and4OOP.finalkeyword;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-20
 **/
public class MyClass {
    final void hello(){
        System.out.println("Hello");
    }
    void hi(){
        System.out.println("hi");
    }

    class Child extends MyClass{
        void hi(){
            System.out.println("Hi child");
        }
    }


}
