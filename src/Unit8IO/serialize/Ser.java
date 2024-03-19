package Unit8IO.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-18
 **/
public class Ser {

    public static void main(String[] args) throws IOException {
        Person person = new Person("Ram",1);
        FileOutputStream fileOutputStream  = new FileOutputStream("person.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
