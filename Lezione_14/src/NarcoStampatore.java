/**
 * Created by pietrocenciarelli on 20/04/17.
 */
public class NarcoStampatore extends Stampatore {
    // stampatore con pennichella

    protected final int ritardo;

    public NarcoStampatore (String parola, int ritardo) {
        // prima di stampare dorme ritardo millisecondi
        super(parola);
        this.ritardo = ritardo;
    }

    public void run () {
        try {
            sleep(ritardo);
            System.out.println(parola);
        } catch (InterruptedException e) {
            System.out.println("Eeehhh... chi mi sveglia?!");
        }
    }
}
