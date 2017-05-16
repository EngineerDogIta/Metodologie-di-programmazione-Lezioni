
public class TestStati {

	public static void main(String[] args) {
		// finanza creativa
		
		Stato svizzera = new Stato ("Svizzera","Franchi",10000);
		// svizzera.Moneta f100; // errore: "svizzera cannot be resolved to a type"
		/* Moneta e' un membro *non* statico di Stato, eppure vi si
		 * accede qualificandolo col nome della classe: */
		
		Stato.Moneta f1 = svizzera.conia(100); // il conio avviene in svizzera!
		f1.stampaValore();
		
		// Stato.Moneta f2 = new Stato.Moneta(77); // errore: no enclosing type!
		/* Stato.Moneta e' dunque un tipo, ma non puo' essere usato per invocare
		 * il costruttore, in quanto, in questo contesto, manca l'outer object */

		Stato.Moneta f2 = svizzera.new Moneta(100); // il conio avviene qui nel main!
		f2.stampaValore();
		/* non ostante f2 abbia lo stesso valore nominale di f1 (100),
		 * l'inflazione galoppa, e il valore in oro di 100 franchi si e' dimezzato! */
	}
}