package Unit3and4OOP.miniproject;



/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-26
 **/
public class PercReportCardService implements ReportCardService{
    @Override
    public void printReportCard(Student student) {
        System.out.println("****************************************************************");
        System.out.println("                       REPORT CARD");
        System.out.println("****************************************************************");
        System.out.println("Student ID: "+student.getId());
        System.out.println("Student Name: "+student.getName());
        System.out.println("================================================================");
        System.out.println("Subject       Full Marks        Pass Marks        Obtained Marks");
        System.out.println("................................................................");
        int totalMarks = 0;
        for(Subject subject : student.getSubjects()){
            System.out.println(subject.getName()+"             "+subject.getFullMarks()+"             "+subject.getPassMarks()+"             "+subject.getObtainedMarks());
            System.out.println("--------------------------------------------------------------------");
            totalMarks += subject.getObtainedMarks();
        }
        int numberOfSubjects = student.getSubjects().length;
        double perc = totalMarks/numberOfSubjects;
        System.out.println("Total Percentage");
        System.out.println(perc);
        System.out.println("************************************************************");
    }
}
