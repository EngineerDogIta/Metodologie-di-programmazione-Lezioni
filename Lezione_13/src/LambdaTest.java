/**
 * Created by pietrocenciarelli on 03/04/17.
 */

import java.util.*;
import java.util.function.Consumer;

// http://codingjam.it/java-8-lambda-in-7-minuti-o-quasi/

public class LambdaTest {

    public static void main(String[] args) {

        List<String> parole = Arrays.asList("Qui", "Quo", "Qua");

        for (String s : parole) // iterazione "for each", usa un oggetto (parole) di tipo Iterable
            System.out.println(s);

        /* In Java 8 l'interfaccia Itarable offre un nuovo modo per iterare: il metodo forEach.
         forEach vuole in input un oggetto di tipo Consumer. Consumer e' un'interfaccia (generica)
         funzionale, ovvero che dichiara un solo metodo; nel caso specifico e' il metodo void accept (T t)
         */

        Consumer<String> stampatore = new Consumer<String>() { // classe anonima, implementa il metodo accept
            public void accept(String s) {
                System.out.println(s);
            }
        };

        parole.forEach(stampatore);

        /*
        Si può fare la stessa cosa usando le espressioni lambda, ovvero funzioni anonime
         */

        parole.forEach((String s) -> System.out.println(s));
           // type inference: la lambda espressione e' un'istanza dell'interfaccia Consumer
        parole.forEach(s -> System.out.println(s)); // type inference sul tipo di s

    }
}
