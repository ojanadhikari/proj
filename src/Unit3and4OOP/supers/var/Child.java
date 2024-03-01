package Unit3and4OOP.supers.var;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-20
 **/
public class Child extends Parent{
    int prop = 120;

    public void display(){
        System.out.println("Parent value= "+super.prop);
        System.out.println("Child value= "+this.prop);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
