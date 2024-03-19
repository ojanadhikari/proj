package Unit7Thread;


/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-19
 **/
class Table1{
    void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }
        System.out.println("Completed");
    }
}

class Th1 extends Thread{
    Table1 t;
    Th1(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class Th2 extends Thread{
    Table1 t;
    Th2(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class Unsync{
    public static void main(String args[]){
        Table1 obj = new Table1();
        Th1 t1=new Th1(obj);
        Th2 t2=new Th2(obj);
        t1.start();
        t2.start();
    }
}

