/**
 * Created by pietrocenciarelli on 27/04/17.
 */
public class Inghippo {
    /*
    Due thread eseguono la pop() su uno stack. Se non sincronizziamo
    (vedi ArrayStack) potrebbe accadere di estrarre due volte lo stesso
    elemento e perderne uno!
     */
    public static void main(String[] args) throws FullStackException {

        ArrayStack S = new ArrayStack(10);

        Popper p1 = new Popper(S);
        p1.setName("Snapo");

        Popper p2 = new Popper(S);
        p2.setName("Raz");

        S.push(33);
        S.push(42);

        p1.start();
        p2.start();


    }
}
