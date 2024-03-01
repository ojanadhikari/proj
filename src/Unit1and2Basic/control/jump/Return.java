package Unit1and2Basic.control.jump;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-12
 **/
public class Return {
    public static void main(String[] args) {
        System.out.println("Before return");
        returnTest();
        System.out.println("After return");
        int sum = add(1, 3);
        System.out.println(sum);
    }

    static void returnTest(){
        for(int i=1;i<=10;i++){
            if(i%5==0){
                return;
            }
            System.out.println(i);
        }
    }

    static int add(int a , int b){
        return a+b;
    }

}
