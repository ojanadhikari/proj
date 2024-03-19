package Unit7Thread;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-19
 **/
class RunnableThreadA implements Runnable{
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Running thread "+i+" From Class A");
        }
        System.out.println("Exit from Class A");
    }
}
class RunnableThreadB implements Runnable{
    public void run() {
        for(int j=1;j<=5;j++) {
            System.out.println("Running thread "+j+" From Class B");
        }
        System.out.println("Exit from Class B");
    }
}
class RunnableThreadC implements Runnable{
    public void run() {
        for(int k=1;k<=5;k++) {
            System.out.println("Running thread "+k+" From Class C");
        }
        System.out.println("Exit from Class C");
    }
}

public class RunnableThreadExample {
    public static void main(String[] args) {
        Thread t1=new Thread(new RunnableThreadA());
        Thread t2=new Thread(new RunnableThreadB());
        Thread t3=new Thread(new RunnableThreadC());
        t1.start();
        t2.start();
        t3.start();
    }
}
