
public abstract class Benchmark {
	// testa il tempo di esecuzione del metodo astratto azione
	// (preso da Arnold/Gosling)
	
	abstract void azione ();
	
	public long ripeti (int n) {
		// calcola il tempo di n esecuzioni del metodo azione
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++)
			azione();
		return(System.currentTimeMillis() - start);
	}
	
}