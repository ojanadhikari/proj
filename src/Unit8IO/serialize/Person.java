package Unit8IO.serialize;

import java.io.Serializable;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-18
 **/
public class Person implements Serializable{
    String name;
    int id;

    Person(String name, int id ){
        this.id = id;
        this.name = name;
    }

}
