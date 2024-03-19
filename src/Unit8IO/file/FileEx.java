package Unit8IO.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-18
 **/
public class FileEx {

    public static void main(String[] args) throws IOException {
        File file  =  new File("/home/ojan/Music");
        for (String name : file.list()){
            System.out.println(name);
        }

        System.out.println(file.isDirectory());
        File file1 = new File("/home/ojan/Music/temp.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());

        File file2 = new File("/home/ojan/Music/hello");
        file2.mkdir();
        System.out.println(file2.isDirectory());
    }
}
