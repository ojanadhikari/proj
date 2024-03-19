package Unit7Thread;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-19
 **/

class TPA extends Thread{
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Running thread "+i+" From Class A");
        }
        System.out.println("Exit from Class A");
    }
}
class TPB extends Thread{
    public void run() {
        for(int j=1;j<=5;j++) {
            System.out.println("Running thread "+j+" From Class B");
        }
        System.out.println("Exit from Class B");
    }
}
class TPC extends Thread{
    public void run() {
        for(int k=1;k<=5;k++) {
            System.out.println("Running thread "+k+" From Class C");
        }
        System.out.println("Exit from Class C");
    }
}
public class PriorityExample {

    public static void main(String[] args) {
        TPA tpa = new TPA();
        TPB tpb = new TPB();
        TPC tpc = new TPC();

        tpa.setPriority(Thread.MIN_PRIORITY);
        tpb.setPriority(2);
        tpc.setPriority(Thread.MAX_PRIORITY);

        tpa.start();
        tpb.start();
        tpc.start();
    }
}
