/**
 * Created by pietrocenciarelli on 28/04/17.
 */
public class DeadLock {
    /*
    Creazione ad arte di una situazione di deadlock: due thread di tipo
    DeadManWalking tentano entrambi di acquisire in sequenza due lock
    su due monitor, ma lo fanno in ordine inverso. Usando la sleep per
    interfogliare opportunamente i thread (vedi DeadManWalking), si
    va in blocco!
     */

    public static void main(String[] args) {

        Object monitor1 = new Object();
        Object monitor2 = new Object();

        DeadManWalking snapo = new DeadManWalking(monitor1, monitor2);
        snapo.setName("Snapo");

        DeadManWalking raz = new DeadManWalking(monitor2, monitor1);
        raz.setName("Raz");

        snapo.start();
        raz.start();
    }
}
