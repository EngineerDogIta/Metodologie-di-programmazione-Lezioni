/**
 * Created by pietrocenciarelli on 27/04/17.
 */

public class ArrayStack {

    /* implementa il tipo di dato astratto degli stack (versione con errori!)
    Solo la pop() è sincronizzata. Non sincronizzando la pop() due pusher
    concorrenti potrebbero estrarre lo stesso elemento.
     */

    private int[] stk;
    private int top = -1;

    ArrayStack(int l) {
        stk = new int[l];
    }

    public int lunghezza () {
        return stk.length;
    }

    public void push (int v) throws FullStackException {
        //inserisce un intero in cima alla pila... se c'è spazio!

        if (top == stk.length - 1) throw new FullStackException();
        top = top + 1;
        stk[top] = v;
    }

    // public synchronized int pop () throws EmptyStackException, InterruptedException {

    public int pop () throws EmptyStackException, InterruptedException {
        //estrae l'elemento in cima alla pila (e lo restituisce)... se esiste!

        System.out.println("Sono " + Thread.currentThread().getName() + " e sto eseguendo pop");

        // synchronized (this) { // in alternativa alla sincronizzazione dell'intero metodo
        synchronized (new Object()) { // questo non funziona: i due popper (vd. Inghippo)...
            // ...si sincronizzano su oggetti diversi
            if (top < 0) throw new EmptyStackException();
            top = top - 1;
            Thread.currentThread().sleep(100); // questa istruzione,...
            // ...se non sincronizzo il codice che la contiene, può causare la perdita di
            // elementi dello stack (vedi Inghippo: si perde 42)
            return stk[top + 1];
        }
    }
}

