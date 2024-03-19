package Unit7Thread;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-19
 **/


class MyThread{
    String resource1 = "BCA";
    String resource2 = "Third Semester";
    void MethodA() {
        synchronized (resource1) {
            System.out.println("Thread 1: locked resource 1 "+resource1);
            synchronized (resource2) {
                System.out.println("Thread 1: locked resource 2 "+resource2);
            }
        }
    }

    void MethodB() {
        synchronized (resource2) {
            System.out.println("Thread 2: locked resource 2 "+resource2);
            synchronized (resource1) {
                System.out.println("Thread 2: locked resource 1 "+resource1);
            }
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        new Thread() {
            public void run() {
                obj.MethodA();
            }
        }.start();
        new Thread() {
            public void run() {
                obj.MethodB();
            }
        }.start();
    }
}
