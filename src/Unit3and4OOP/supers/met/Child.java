package Unit3and4OOP.supers.met;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-20
 **/
public class Child extends Parent{
    void display(){
        super.display();
        System.out.println("Printing from child");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

