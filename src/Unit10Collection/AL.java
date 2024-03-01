package Unit10Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-18
 **/
public class AL {
    public static void main(String[] args) {
        List<String> stringList =new ArrayList<>();

        stringList.add("hi");
        stringList.add("hello");
        stringList.add("hi");


        System.out.println(stringList.size());
//        stringList.remove(2);
//        System.out.println(stringList.size());
        for (String s: stringList){
            System.out.println(s);
        }


        List<Student> studentList = new ArrayList<>();
        Student student = new Student(1,"Ram");
        studentList.add(student);
        Student student1 = new Student(2,"Shyam");
        studentList.add(student1);
        Student student2 = new Student(1,"Ram");
        studentList.add(student2);

        System.out.println(studentList.size());
        for (Student s :studentList){
            System.out.println("id="+s.getId());
            System.out.println("name="+s.getName());
        }
    }
}
