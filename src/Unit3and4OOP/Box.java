package Unit3and4OOP;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-14
 **/
public class Box {
    double height;
    double width;
    double depth;
    double volume;

    void printVolume(){
        height = 10;
        width = 10;
        depth = 10;
        volume = height*width*depth;
        System.out.println("Volume ="+volume);
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.printVolume();
    }
}
