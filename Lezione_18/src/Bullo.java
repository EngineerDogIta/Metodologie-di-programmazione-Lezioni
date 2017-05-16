import java.util.Random;

/**
 * Created by pietrocenciarelli on 12/05/17.
 */
public class Bullo extends Thread {
    /*
    Essenzialmente, prende una pupa dalla coda e la bacia, fino
    alla fine del ballo. Quando esegue extract() potrebbe bloccarsi
    (nel caso non ci siano pupe) in attesa *sulla coda del ballo*
     */

    public Bullo (String nome) {
        super();
        setName(nome);
    }

    private void baciaPupa (Pupa P) {
        System.out.println( getName() + ": bacio " + P.getName());
        P.sveglia();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < Ballo.tempo; i++) {
                if (isInterrupted()) throw new InterruptedException();
                sleep(new Random().nextInt(20));
                Pupa mySweetHeart = Ballo.coda.extract();
                baciaPupa(mySweetHeart);
            }
        } catch (InterruptedException e) {
            System.out.println("ciao!");
        }
    }
}
