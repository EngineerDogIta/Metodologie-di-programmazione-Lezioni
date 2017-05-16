
/**
 * Created by pietrocenciarelli on 05/05/17.
 */
public class ArrayStackBrutto implements Stack {

    /* implementa il tipo di dato astratto degli stack in
    contesto concorrente. Si sincronizzano le sezioni
    critiche di push e pop. Quando un consumatore trova
    lo stack vuoto aspetta mettendosi a dormire (sleep)
    *fuori* dalla sezione critica. Non funziona perche'
    fra test e aggiornamento dello stack possono esserci
    interferenze! (...ne' potrebbe farlo *dentro*!)
    */

    private int[] stk;
    private int top = -1;

    ArrayStackBrutto(int l) {
        stk = new int[l];
    }

    private void aspetta () throws InterruptedException {
        Thread.currentThread().sleep(100);
    }

    public boolean isEmpty () {
        return top == -1;
    }

    public boolean isFull () {
        return top == stk.length -1;
    }

    public void push (int v) throws InterruptedException {
        //inserisce un intero in cima alla pila
        // ...se c'è spazio, altrimenti aspetta!

        while (isFull())
            aspetta();

        // okkio qui!!!

        synchronized (this) {
            System.out.println("inserisco " + v);
            top = top + 1;
            stk[top] = v;
        }
    }


    public int pop () throws InterruptedException {
        //estrae l'elemento in cima alla pila (e lo restituisce)
        // ... se esiste, altrimenti aspetta!

        while (isEmpty())
            aspetta();

        // okkio qui!!!

        synchronized (this) {
            int result = stk[top];
            System.out.println("estraggo " + result);
            top = top - 1;
            return result;
        }
    }
}
