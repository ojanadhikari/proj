package Unit8IO.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-18
 **/
public class FIS {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("file.txt");
        int i =0;
        while ((i=fileInputStream.read())!=-1){
            System.out.print((char) i);
        }
        fileInputStream.close();
    }
}
