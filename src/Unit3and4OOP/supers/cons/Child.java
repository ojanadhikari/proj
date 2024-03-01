package Unit3and4OOP.supers.cons;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-20
 **/
public class Child extends Parent{

    Child(){
        super();
        System.out.println("I am child's non parameterized constructor");
    }

    Child(int a){
        super(a);
        System.out.println("I am child's parameterized constructor: "+a);
    }

    public static void main(String[] args) {
        Child child = new Child();
        Child child1 = new Child(12);
    }
}
