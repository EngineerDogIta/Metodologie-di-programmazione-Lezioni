/**
 * Created by pietrocenciarelli on 20/04/17.
 */
public class Snaporaz {
    // gioca a snapo-snapo-raz

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new StampatoreCompulsivo("snapo", 30);
        t1.setName("Snapo");

        Thread t2 = new StampatoreCompulsivo("raz", 100);
        t2.setName("Raz");

        t1.start();
        t2.start();

        Thread.currentThread().sleep(5000);

        t1.interrupt();
        t2.interrupt();

        System.out.println("io avrei finito...");
    }
}
