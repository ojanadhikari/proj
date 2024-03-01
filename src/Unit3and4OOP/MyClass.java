package Unit3and4OOP;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class MyClass {
    int a,b;

    MyClass(){
        a=10;
        b=20;
    }

    MyClass(int val1 , int val2){
        a = val1;
        b = val2;
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        MyClass myObject1 = new MyClass(12,13);
    }
}

