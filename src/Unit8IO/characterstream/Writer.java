package Unit8IO.characterstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-18
 **/
public class Writer {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("rfile.txt");
        writer.write("This is a sample file");
        writer.close();
    }
}
