package Unit8IO.characterstream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-18
 **/
public class Reader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("rfile.txt");
        int i=0;
        while ((i= fileReader.read())!=-1){
            System.out.print((char) i);
        }
        fileReader.close();
    }
}
