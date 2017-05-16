/**
 * Created by pietrocenciarelli on 20/04/17.
 */
public class Stampatore extends Thread {

    protected final String parola;

    public Stampatore (String parola) {
        this.parola = parola;
    }

    public void run () {
        System.out.println(parola);
    }
}
