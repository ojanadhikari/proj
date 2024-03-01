package Unit3and4OOP;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class NestedClass {
    int x;
    class InnerClass{
        int y;
    }
    static class StaticInnerClass{
        int z;
    }

    public static void main(String[] args) {
        NestedClass nestedClassObject = new NestedClass();
        NestedClass.InnerClass innerClassObject = nestedClassObject.new InnerClass();
        System.out.println(nestedClassObject.x +","+innerClassObject.y);
        //Object of a non static inner class cannot be created like this
//        InnerClass innerClassObject2 = new InnerClass();
        StaticInnerClass staticInnerClassObj = new StaticInnerClass();
        System.out.println(staticInnerClassObj.z);
    }
}
