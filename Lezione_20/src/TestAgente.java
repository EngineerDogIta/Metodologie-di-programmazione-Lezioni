import java.lang.reflect.*;

/**
 * Created by pietrocenciarelli on 19/05/17.
 */
public class TestAgente { // Esempio per motivare l'uso della reflection
    /*
    Supponiamo di voler scrivere un main per testare un homework dove si chiede
    di implementare l'interfaccia Agente. Tipicamente gli studenti consegnano
    classi che non si chiamano come gli e' stato chiesto (MyAgente), o che
    non implementano Agente, con i giusti metodi (azione)...
    Usando la reflection si può scrivere un tester per l'homework senza avere
    a disposizione la classe MyAgente: si trattano a tempo di esecuzione gli
    errori che altrimenti verrebbero intercettati dal compilatore
     */

    public static void main(String[] args) {

        Agente x = new MyAgente("Knapp");
        x.azione();
        /*
        facendo in questo modo, per verificare se il main
        funziona, dobbiamo fornire una classe MyAgente!
         */

        try {
            Class<?> C = Class.forName("MyAgente");
            Type[] T = C.getGenericInterfaces();

            boolean trovato = false;
            for (Type t : T) // cerca "Agente" fra le interfacce implementate da MyAgente
                if (t.getTypeName() == "Agente")
                    trovato = true;
            if (!trovato)
                System.out.println("MyAgente deve implementare l'interfaccia Agente");
            Method agisco = C.getMethod("azione");

        } catch (ClassNotFoundException e) {
            System.out.println("Non e' stata definita una classe MyAgente");
        } catch (NoSuchMethodException e) {
            System.out.println("Non e' stata definita un metodo azione()");
        }
    }
}
