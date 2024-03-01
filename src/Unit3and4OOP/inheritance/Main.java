package Unit3and4OOP.inheritance;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-17
 **/
public class Main {

    public static void main(String[] args) {
        GrandFather grandFather = new GrandFather();
        int gp1 = grandFather.gp1;
        int gp3 = grandFather.gp3;

        Father father = new Father();
        int gp11 = father.gp1;
        int gp31 = father.gp3;

        int pp1 = father.pp1;
        int pp3 = father.pp3;

        Child child = new Child();
        int gp12 = child.gp1;
        int gp32 = child.gp3;

        int pp11 = child.pp1;
        int pp31 = child.pp3;
        int pp4 = child.pp4;

    }
}
