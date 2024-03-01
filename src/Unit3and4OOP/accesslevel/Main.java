package Unit3and4OOP.accesslevel;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(10,20);
        //public property can be accessed
        int width = shape.width;
        //private property cannot be accessed
//        int height = shape.height;
    }
}
