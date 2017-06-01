/**
 * Created by pietrocenciarelli on 19/05/17.
 */
public class AnnotatedAStack extends ArrayStack {
    /*
    Annotated ArrayStack ridefinisce lunghezza lunghezza().
    Serve solo a mostrare che IntelliJ usa le annotazioni (@override)
    Nota: bisogna definire un costruttore dato che non c'e' un
    costruttore di default in ArrayStack!
    */

    AnnotatedAStack () {
        super(10);
    }

    @Override
    public int lunghezza() {
        return super.lunghezza();
    }

}
