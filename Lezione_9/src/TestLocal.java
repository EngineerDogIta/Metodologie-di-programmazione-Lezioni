public class TestLocal {
    /*
    Classe *locale* a un metodo (m). Visibilita' e accesso alle varibili locali
     */

    int attr1 = 7;
    {int attr2 = attr1;
    int attr3 = attr2;} // questo e' un blocco! ...ma un blocco non era uno statement?!
    // int attr4 = attr2; // attr2 non e' visibile fuori dal blocco in cui e' definita

    class Inner { // classe annidata
    }

    public int m () {

        int y = 3;

        /* nei manuali trovate scritto che le classi locali hanno accesso
        solo alle variabili final. Ma che vuol dire "avere accesso"?
         */

        class LocalInner { // classe locale al metodo m

            int q () {
                // int result = y; // eclipse non lo consente!
                // ... intelliJ (e javac!) si'!! consentono l'accesso a y *in lettura*
                // y = y + 1; // ...ma non in scrittura!
                return 42;
            }

        }

        return new LocalInner().q();
    }

    public static void main(String[] args) {

        Inner I;
        // LocalInner J; // LocalInner non e' visibile fuori dal blocco in cui e' definita

        System.out.println(new TestLocal().m());
    }
}