import java.util.*; // contiene la classe Scanner

// vedi https://docs.oracle.com/javase/8/docs/api/java/util/List.html
// vedi https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

public class Sequenze {

	public static void main(String[] args) {
		// uso della classe generica LinKedList
		
		LinkedList<String> testo = new LinkedList<String>(); // sequenza di stringhe
		LinkedList<Integer> numeri = new LinkedList<Integer>(); // sequenza di interi (Integer)
		
		Scanner input = new Scanner(System.in);
		// La classe Scanner implementa uno scanner di testo, utile per leggere da tastiera
		// System.in e' un oggetto di tipo InputStream
		
		System.out.println("Prego, digita una parola:");
		String s = input.nextLine(); // input di una stringa
		System.out.println("Ho letto " + s);
		
		System.out.println("Dammi altre parole separate da a-capo e termina con fine");
		
		int i = 1;
		while (!s.equals("fine")) { // ciclo di input
			testo.add(s); // aggiunge la stringa s alla lista testo
			numeri.add(new Integer(i++)); // aggiunge un nuovo Integer alla lista numeri
			s = input.nextLine(); // input di una nuova stringa
		}
		
		System.out.println("hai scritto:");
		i = 0;
		for (String x : testo) // ciclo for-each
			System.out.println(numeri.get(i++).intValue() + ": " + x);
		
	}
	
}