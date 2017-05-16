/**
 * Created by pietrocenciarelli on 05/05/17.
 */
public class Pusher extends Thread {
    // esegue una push di valore su pila

    private Stack pila;
    private int valore;

    public Pusher (Stack pila, int valore) {
        this.pila = pila;
        this.valore = valore;
    }

    @Override
    public void run() {
        try {
            pila.push(valore);
        } catch (InterruptedException e) {
            System.out.println("Dormivo...");
        }
    }
}
