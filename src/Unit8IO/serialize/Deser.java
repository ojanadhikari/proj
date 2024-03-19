package Unit8IO.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-18
 **/
public class Deser {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person = (Person) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
        System.out.println(person.id);
        System.out.println(person.name);
    }
}
