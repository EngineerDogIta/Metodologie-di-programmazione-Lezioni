/**
 * Created by pietrocenciarelli on 08/05/17.
 */
public class RonaldDrump implements Runnable {
    public void run () {
        int i;
        // while (!isInterrupted()) { // non funziona peche' non e' un thread!
        while (!Thread.currentThread().isInterrupted()) {
            for (i=0; i<100000; i++);
            System.out.print("Ronald ");
            for (i=0; i<100000; i++);
            System.out.println("Drump");
        }
        System.out.println("BOOM!");
    }
}
