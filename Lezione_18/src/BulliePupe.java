/**
 * Created by pietrocenciarelli on 12/05/17.
 */
public class BulliePupe {
    /*
    Lancia due bulli e due pupe che si incontrano al ballo; alla
    fine del ballo (100 millisecondi) termina i quattro partecipanti
     */

    public static void main(String[] args) throws InterruptedException {

        Pupa P1 = new Pupa("Genoveffa");
        Pupa P2 = new Pupa("Anastasia");

        P1.start();
        P2.start();

        Bullo B1 = new Bullo("Frank");
        Bullo B2 = new Bullo("Marlon");

        B1.start();
        B2.start();

        Thread.currentThread().sleep(100);
        B1.interrupt();
        B2.interrupt();
        P1.interrupt();
        P2.interrupt();
    }
}
