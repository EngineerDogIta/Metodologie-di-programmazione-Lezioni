/**
 * Created by pietrocenciarelli on 28/04/17.
 */
public class DeadManWalking extends Thread {

    // Due lock annidati su monitor diversi

    Object o1, o2;

    public DeadManWalking (Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run() {
        synchronized (o1) {
            /* try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } */
            synchronized (o2) {
                System.out.println("Sono " + getName() + " e lotto insieme a voi!");
            }
        }
    }
}
