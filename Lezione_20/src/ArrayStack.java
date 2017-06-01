/**
 * Created by pietrocenciarelli on 19/05/17.
 */
public class ArrayStack {

    // solita implementazione del tipo di dato astratto degli stack;
    // annota una condizione di consistenza sull'indice top

    protected int[] stk;

    @ArrayConsistency(
            condition = "-1 <= top < stk.length"
    )
    private int top = -1;

    ArrayStack(int l) {
        stk = new int[l];
    }

    public int lunghezza () {
        return stk.length;
    }

    public void push (int v) throws Exception {
        //inserisce un intero in cima alla pila... se c'è spazio!

        if (top == stk.length - 1) throw new Exception();
        top = top + 1;
        stk[top] = v;
    }

    public int pop () throws Exception {
        //estrae l'elemento in cima alla pila e lo restituisce... se esiste!

        if (top < 0) throw new Exception();
        top = top - 1;
        return stk[top + 1];
    }

}