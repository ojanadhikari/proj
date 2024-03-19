package Unit8IO.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-18
 **/
public class FOS {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        String s = "This is a text";
        byte[] b = s.getBytes();
        fileOutputStream.write(b);
        fileOutputStream.close();
    }
}
