/**
 * Created by pietrocenciarelli on 06/04/17.
 */

public class FunzioTest {
    /*
    due lambda istanze dell'interfaccia funzionale Funzio; in entrambi
    i casi il contesto permette di inferire il tipo delle espressioni.
    Nota: le espressioni lambda denotano oggetti di classi anonime
    ma non vengono creati mediante la new!
     */

    public static Funzio F = (String s) -> s;

    public static void contesto (Funzio x) {
        System.out.println(x.calcola("quarantadue"));
    }

    public static void main(String[] args) {
        System.out.println(F.calcola("tredici")); // cosa stampa?
        contesto((String s) -> "cento"); // cosa stampa?
    }
}
