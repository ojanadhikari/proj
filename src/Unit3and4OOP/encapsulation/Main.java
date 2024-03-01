package Unit3and4OOP.encapsulation;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-17
 **/
public class Main {
    public static void main(String[] args) {
        Box box = new Box(11,12,13);
        Box box1 = new Box();
        box1.setHeight(10);
        box1.setLength(10);
        box1.setWidth(10);

    }
}
