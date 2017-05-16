/**
 * Created by pietrocenciarelli on 08/05/17.
 */
public class JimKongOn extends Thread {
    public void run () {
        int i;
        while (!isInterrupted()) {
            for (i=0; i<100000; i++);
            System.out.print("Jim ");
            for (i=0; i<100000; i++);
            System.out.println("KongOn");
        }
        System.out.println("BOOM!");
    }
}
