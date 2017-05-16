/**
 * Created by pietrocenciarelli on 05/05/17.
 */
public class Popper extends Thread {
    // esegue una pop su pila

    private Stack pila;
    public Popper (Stack pila) {
        this.pila = pila;
    }

    @Override
    public void run() {
        try {
            pila.pop();
        } catch (InterruptedException e) {
            System.out.println("Dormivo...");
        }
    }
}
