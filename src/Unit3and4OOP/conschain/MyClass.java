package Unit3and4OOP.conschain;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-20
 **/
public class MyClass {
    MyClass(){
        this(1);
        System.out.println("I am cons. with no param");
    }

    MyClass(int a){
        this(a,2);
        System.out.println("I am cons. with 1 param");
    }

    MyClass(int a, int b){
        System.out.println("I am cons. with 2 param");
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
    }
}
