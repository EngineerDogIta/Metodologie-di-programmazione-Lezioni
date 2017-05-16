import java.util.Random;

/**
 * Created by pietrocenciarelli on 12/05/17.
 */
public class Pupa extends Thread {
    /*
    Essenzialmente, una pupa si inserisce (il thred come oggetto) nella
    coda del ballo e attende (usando se stessa come monitor!!!) che un
    bullo la risvegli, e ripete fino alla fine del ballo.
     */

    public Pupa (String nome) {
        super();
        setName(nome);
    }

    public synchronized void sveglia () {
        notify();
    } // invocato dai bulli

    @Override
    public synchronized void run() { // synchronized!
        try {
            for (int i = 0; i < Ballo.tempo; i++) {
                if (isInterrupted()) throw new InterruptedException();
                sleep(new Random().nextInt(20));
                Ballo.coda.insert(this);
                wait();
                System.out.println("Cielo, che bacio!");
            }
        } catch (InterruptedException e) {
            System.out.println("ciao!");
        }
    }
}
