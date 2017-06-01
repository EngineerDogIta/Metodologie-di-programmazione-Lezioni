import java.lang.reflect.*;

/**
 * Created by pietrocenciarelli on 19/05/17.
 */
public class Violazione {

    /*
    mostra la possibilita' di violare un campo privato mediante la reflection,
    con conseguente malfunzionamento della struttura dati (stack)
     */

    public static void main(String[] args) throws Exception {

        ArrayStack s = new ArrayStack(10);
        s.push(31);
        s.push(32);
        s.push(33);

        // s.top = 1; // NO, top e' privato! ...pero' usando la reflection...

        try {
            Class<?> C = s.getClass();
            Field f = C.getDeclaredField("top");
            f.setAccessible(true); // bisogna inibire il controllo d'accesso!
            f.set(s, 1);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(s.pop()); // cioe', ha saltato un elemento dello stack
    }
}
