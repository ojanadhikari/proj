package Unit3and4OOP.polymorphism;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-17
 **/
public class OverLoading {

    void hello(){
        System.out.println("I have no param");
    }
    void hello(int a){
        System.out.println("I have 1 param");
    }
    void hello(int a, int b){
        System.out.println("I have 2 param");
    }

    public static void main(String[] args) {
        OverLoading obj = new OverLoading();
        obj.hello();
        obj.hello(1);
        obj.hello(1,2);
    }
}
