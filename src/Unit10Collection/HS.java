package Unit10Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-18
 **/
public class HS {

    public static void main(String[] args) {
        Set<String> stringSet =new HashSet<>();

        stringSet.add("hi");
        stringSet.add("hello");
        stringSet.add("hi");

        System.out.println(stringSet.size());

        for (String s: stringSet){
            System.out.println(s);
        }
//
        Set<Student> studentSet = new HashSet<>();
        Student student = new Student(1,"Ram");
        studentSet.add(student);
        Student student1 = new Student(2,"Shyam");
        studentSet.add(student1);
        Student student2 = new Student(1,"Ram");
        studentSet.add(student2);

        System.out.println(studentSet.size());
        for (Student s :studentSet){
            System.out.println("id="+s.getId());
            System.out.println("name="+s.getName());
        }
    }
}
