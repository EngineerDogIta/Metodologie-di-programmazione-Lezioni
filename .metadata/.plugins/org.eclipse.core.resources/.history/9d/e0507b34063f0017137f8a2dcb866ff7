/**
 * Created by pietrocenciarelli on 03/04/17.
 */

public class Anonymous {
    /*
    Due modi di creare classi anonime: estendendo una classe o implementando un'interfaccia
     */

    public static void main(String[] args) {

        Leggibile <String> x = new MyLeggibile<String>("Bubu!") {
            /*
            Classe anonima: estende MyLeggibile<String>, ridefinendone il metodo get
            Nota: si puo' usare un costruttore con parametro
            */

            public String get() {
                System.out.print("Ciao ");
                return super.get(); // chiama la get() del padre
            }
        };

        Leggibile <Integer> y = new Leggibile<Integer>() {
            /*
            Classe anonima: implementa l'interfaccia Leggibile<String>
            Nota: quando una classe anonima e' definita come sottotipo di un'interfacia
            si puo' usare solo il costruttore di default!
             */

            public Integer get() {
                return 42;
            }
        };

        System.out.println(x.get());
        System.out.println(y.get());
    }
}