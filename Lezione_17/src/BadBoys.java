/**
 * Created by pietrocenciarelli on 08/05/17.
 */
public class BadBoys {
    /*
    Lancia e poi interrompe tre bad boys. Uno e' di una classe che estende
    Thread, gli altri due sono thread tout-court, costruiti con un runnable
     */

    public static void main(String[] args) throws InterruptedException {

        JimKongOn K = new JimKongOn();

        Thread D = new Thread(new RonaldDrump());
        EnricoBossi governatore = new EnricoBossi();
        Thread G = new Thread(governatore);

        K.start();
        D.start();
        G.start();

        Thread.currentThread().sleep(5);

        K.interrupt();
        D.interrupt();
        // G.interrupt(); // non si ferma, maledizione!
        governatore.fermati();
    }
}
