package Unit7Thread;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-19
 **/

class TE1 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Running thread "+i+" From Class A");
            if(i==3) stop();
        }
        System.out.println("Exit from Class A");
    }
}

class TE2 extends Thread{
    @Override
    public void run(){
        for(int j=1;j<=5;j++) {
            System.out.println("Running thread "+j+" From Class B");
            if(j==2)
                try {
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
        }
        System.out.println("Exit from Class B");
    }
}
public class ThreadExecution {
    public static void main(String[] args) {
//        TE1 te1 = new TE1();
//        te1.start();

        TE2 te2 = new TE2();
        te2.start();
    }

}



