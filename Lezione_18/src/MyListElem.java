/**
 * Created by pietrocenciarelli on 12/05/17.
 */

public class MyListElem<E> { // i soliti elementi di linked list

    public E value;
    public MyListElem<E> next = null;

    MyListElem (E value) {
        this.value = value;
    }
}
