package Unit3and4OOP.miniproject;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-26
 **/
public class Subject {
    private String name;
    private int fullMarks;
    private int passMarks;
    private int obtainedMarks;

    public Subject(){
        this.fullMarks = 100;
        this.passMarks = 40;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullMarks() {
        return fullMarks;
    }

    public int getPassMarks() {
        return passMarks;
    }

    public int getObtainedMarks() {
        return obtainedMarks;
    }

    public void setObtainedMarks(int obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }
}
