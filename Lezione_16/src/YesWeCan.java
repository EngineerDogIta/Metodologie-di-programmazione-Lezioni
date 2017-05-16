/**
 * Created by pietrocenciarelli on 04/05/17.
 */
public class YesWeCan {
    /* I metodi wait, notify e notifyAll possono essere invocati esclusivamente
     * all'interno di codice sincronizzato, utilizzando il lock dell'oggetto sul
     * quale vengono invocati. L'invocazione può essere fatta direttamente dal
     * codice sincronizzato o indirettamente da uno dei metodi invocati al suo
     * interno. Qualora si cercasse di invocare questi metodi su di un oggetto
     * del quale non si possegga il lock, si otterrebbe un'eccezione
     */
    public synchronized void ywc1 () throws InterruptedException {
        // public void ywc1 () throws InterruptedException {
        ywc2();
    }

    public void ywc2 () throws InterruptedException {
        wait();
        //new Object().wait(); // errore
        Object a = new Object();
        synchronized (a) {
            a.wait();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        YesWeCan zot = new YesWeCan();
        zot.ywc1();
    }
}
