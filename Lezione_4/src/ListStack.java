import java.util.EmptyStackException;

public class ListStack {
	// implementa gli stack come liste
	
	public int lunghezza = 0;
	private IntList lista = null;
	
	public boolean is_empty() {
		//restituisce true se lo stack � vuoto, false altrimenti
		
		return lunghezza == 0;
	}
	
	public void push(int v) {
		// inserisce un intero in cima alla pila
		
		lista = new IntList(v, lista);
		lunghezza = lunghezza +1 ;
	}
	
	public int pop() throws EmptyStackException{
		//estrae l'elemento in cima alla pila (e lo restituisce)... se esiste!
		
		if(lunghezza == 0) throw new EmptyStackException();
		int top = lista.head;
		lista = lista.tail;
		lunghezza = lunghezza-1;
		return top;
	}

}
