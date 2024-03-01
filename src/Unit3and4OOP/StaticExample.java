package Unit3and4OOP;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class StaticExample {
    static int staticVal;
    int val;
    void incVal(){
        val++;
        System.out.println("Increased value = "+val);
    }
    static void incStaticVal(){
        staticVal++;
        System.out.println("Increased static value="+staticVal);
    }
    public static void main(String[] args) {
        StaticExample staticExample1 = new StaticExample();
        staticExample1.incVal();
        StaticExample.incStaticVal();
        StaticExample staticExample2 = new StaticExample();
        staticExample2.incVal();
        StaticExample.incStaticVal();
        StaticExample staticExample3 = new StaticExample();
        staticExample3.incVal();
        StaticExample.incStaticVal();
    }
}
