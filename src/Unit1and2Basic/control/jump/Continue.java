package Unit1and2Basic.control.jump;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-02-12
 **/
public class Continue {
    public static void main(String[] args) {
        for(int i =0; i<=10;i++){
            if(i%5==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
