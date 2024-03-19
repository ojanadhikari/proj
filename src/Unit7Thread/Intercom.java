package Unit7Thread;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-19
 **/

class AThread{
    int amount=10000;
    synchronized void withdraw(int amt) {
        System.out.println("Going to Withdraw...");
        if(amount<amt) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        amount-=amt;
        System.out.println("Withdraw Completed with Rs. "+amt);
        System.out.println("Balance is Rs. "+amount);
    }
    synchronized void deposit(int amt) {
        System.out.println("Going to Deposit...");
        amount+=amt;
        System.out.println("Deposit Completed with Rs. "+amt);
        System.out.println("Balance is Rs. "+amount);
        notify();
    }
}

public class Intercom {
    public static void main(String[] args) {
        AThread obj=new AThread();
        new Thread() {
            public void run() {
                obj.withdraw(15000);
            }
        }.start();

        new Thread() {
            public void run() {
                obj.deposit(10000);
            }
        }.start();
    }
}
