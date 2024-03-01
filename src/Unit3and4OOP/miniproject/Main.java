package Unit3and4OOP.miniproject;

import java.util.Scanner;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-26
 **/
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Percent or Grade?(Enter 0 for Percent, any other for Grade)");
        int choice  = scanner.nextInt();
        ReportCardService reportCardService;
        if(choice == 0){
            reportCardService = new PercReportCardService();
        }else {
            reportCardService = new GradeReportCardService();
            reportCardService.printReportCard(student);
            return;
        }
        System.out.println("Enter name of student:");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.println("Enter id of student");
        int id = scanner.nextInt();
        student.setId(id);
        System.out.println("Enter your number of subjects");
        int num = scanner.nextInt();
        Subject[] subjects = new Subject[num];
        for(int i = 0; i<num;i++){
            Subject subject = new Subject();
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter subject name:");
            String sName = scanner1.nextLine();
            subject.setName(sName);

            System.out.println("Enter obtained marks:");
            int oMarks = scanner1.nextInt();
            subject.setObtainedMarks(oMarks);
            subjects[i] = subject;
        }
        student.setSubjects(subjects);
        reportCardService.printReportCard(student);
    }
}
