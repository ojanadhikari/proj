package Unit3and4OOP.supers.cons;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-20
 **/
public class Parent {
    Parent(){
        System.out.println("I am parent's non parameterized constructor");
    }

    Parent(int data){
        System.out.println("I am parent's parameterized constructor: "+data);
    }
}
