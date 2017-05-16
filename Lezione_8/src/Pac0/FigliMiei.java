package Pac0;

public class FigliMiei {
	// Campi statici

	public static int NUMEROFIGLI = 0; // viene incrementato ad ogni figlio che
										// nasce
	private int nome;

	public FigliMiei() {
		nome = ++NUMEROFIGLI; // il nome di un figlio è il suo numero d'ordine
	}

	public void chiSono() { // dichiara l'identita' di this
		System.out.println("Sono " + nome);
	}
}