/**
 * Created by pietrocenciarelli on 12/05/17.
 */

public class SynchroCoda <E> {
    /*
    implementazione con linked list del tipo di dato astratto
    delle code in ambiente multithreading
    */

    protected MyListElem<E> first = null; // da qui si estrae
    protected MyListElem<E> last = null; // qui si inserisce

    public synchronized boolean isEmpty () {
        return (first == null);
    }

    public synchronized void insert (E elem) {
        // System.out.println("inserisco " + elem);

        if (isEmpty()) {
            first = last = new MyListElem<E>(elem);
            notifyAll();
        }
        else {
            last.next = new MyListElem<E>(elem);
            last = last.next;
        }
    }

    public synchronized E extract () throws InterruptedException {

        while (isEmpty())
            wait();

        E result = first.value;
        // System.out.println("estraggo " + result);

        first = first.next;
        if (first == null) last = null;
        return result;
    }
}
