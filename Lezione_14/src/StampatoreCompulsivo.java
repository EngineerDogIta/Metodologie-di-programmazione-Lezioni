/**
 * Created by pietrocenciarelli on 20/04/17.
 */
public class StampatoreCompulsivo extends NarcoStampatore {
    // dorme, poi stampa, poi dorme, poi stampa... per sempre!

    public StampatoreCompulsivo(String parola, int ritardo) {
        super(parola, ritardo);
    }

    public void run () {
        try {
            for (;;) { // ciclo infinito
                sleep(ritardo); // se sleep e' interrotto, lancia l'eccezione
                System.out.println(parola);
            }
        } catch (InterruptedException e) {
            System.out.println("Chi osa svegliare " + getName() + "??!!");
        }
    }
}
