
public class ConcreteBenchmark extends Benchmark {

	void azione () {
		// non fa assolutamente nulla
	}
	
	public static void main(String[] args) {
		// prende in input da args[0] il numero di esecuzioni (numerotest)
		// crea un benchmark e calcola il tempo di numerotest esecuzioni del metodo azione

		int numerotest = Integer.parseInt(args[0]);
		
		// long tempo = this.ripeti(numerotest); // NO, main è statico: non esiste un this!
		// Benchmark b = new Benchmark(); // Non si possono creare oggetti di classi astratte
		long tempo = new ConcreteBenchmark().ripeti(numerotest);
		System.out.println(numerotest + " azioni in " + tempo + " millisecondi");
	}

}