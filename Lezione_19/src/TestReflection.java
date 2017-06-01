/**
 * Created by pietrocenciarelli on 14/05/17.
 */
import java.lang.reflect.*;

public class TestReflection {
    /*
    Viene creato un oggetto di tipo Class e viene usato per costruire
    un oggetto della classe corrispondente e invocarne un metodo.
    Class e' un tipo generico!
     */

    private static void printMembers (Member[] mems) {
        // stampa un array di oggetti di tipo Member
        for (Member m : mems) {
            System.out.println(m);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {

        String s = "Snap";
        /*
        tre modi per creare l'oggetto di tipo Class
        che rappresenta la classe delle stringhe
        */
        System.out.println(s.getClass()); // 1) usando una stringa
        System.out.println(String.class); // 2) usando il literal String
        System.out.println(Class.forName("java.lang.String")); // passando il nome della classe al metodo forName
        System.out.println(Class.forName("java.lang.String").getSimpleName()); // restituisce il nome semplice


        Class<?> C = Class.forName(args[0]); // e' un Class<?> perche' non sappiamo cosa troviamo scritto in args[0]
        System.out.println(C);

        printMembers(C.getDeclaredConstructors());
        printMembers(C.getDeclaredFields());
        printMembers(C.getDeclaredMethods());

        Method m0 = C.getDeclaredMethods()[0]; // rappresenta il metodo scappa
        Method m1 = C.getDeclaredMethods()[1]; // rappresenta il metodo mangiaPollo
        Constructor faiUnHusky = C.getDeclaredConstructors()[1]; // il costruttore con argomento

        Object H1 = C.newInstance(); // si crea un oggetto invocandone il costruttore di default
        m0.invoke(H1); // invoke e' un metodo della classe Method

        Object H2 = faiUnHusky.newInstance("Zampa"); // per invocare un costruttore
        // diverso da quello di default bisogna utilizzare un oggetto di tipo Constructor
        m1.invoke(H2);

    }
}