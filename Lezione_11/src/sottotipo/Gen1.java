package sottotipo;

public class Gen1 <E> {

	public void stampa (E x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		new Gen1<String>().stampa("gnat");
		new Gen1().stampa("blu"); // si può omettere il parametro (String)
		// ...per consentire la compilazione di codice precedente a Java 5
	}

}
