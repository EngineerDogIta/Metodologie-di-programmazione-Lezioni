/**
 * Created by pietrocenciarelli on 05/05/17.
 */
public class ArrayStackBello implements Stack {

    /* implementa il tipo di dato astratto degli stack
    in un contesto concorrente. Risolve con il problema di
    ArrayStackBrutto usando wait e notify
    */

    private int[] stk;
    private int top = -1;

    ArrayStackBello(int l) {
        stk = new int[l];
    }

    public boolean isEmpty () {
        return top == -1;
    }

    public boolean isFull () {
        return top == stk.length -1;
    }

    public synchronized void push (int v) throws InterruptedException {
        //inserisce un intero in cima alla pila
        // ...se c'è spazio, altrimenti aspetta!

        while (isFull())
            wait();

        System.out.println("inserisco " + v);
        top = top + 1;
        stk[top] = v;
        notifyAll();
    }


    public synchronized int pop () throws InterruptedException {
        //estrae l'elemento in cima alla pila (e lo restituisce)
        // ... se esiste, altrimenti aspetta!

        while (isEmpty())
            wait();

        int result = stk[top];
        System.out.println("estraggo " + result);
        top = top - 1;
        notifyAll();
        return result;
    }
}

