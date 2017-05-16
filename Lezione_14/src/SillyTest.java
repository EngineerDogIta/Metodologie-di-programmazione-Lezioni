/**
 * Created by pietrocenciarelli on 20/04/17.
 */
public class SillyTest {
    // creates and runs silly useless threads

    public static void main(String[] args) {

        Thread t1 = new Thread();
        Thread t2 = new Thread();

        // Thread t3 = new Stampatore("sgnic sgnac");
        // Thread t4 = new Stampatore("snaporaz");
        // Thread t5 = new NarcoStampatore("sgnic sgnac", 100);
        // Thread t6 = new NarcoStampatore("snaporaz", 10);

        t1.start(); // il metodo run() di Thread e' vuoto
        t2.start(); // ...dunque qui non succede niente.
        // t3.start();
        // t4.start();
        // t5.start();
        // t6.start();

        System.out.println("io avrei finito...");
    }
}
