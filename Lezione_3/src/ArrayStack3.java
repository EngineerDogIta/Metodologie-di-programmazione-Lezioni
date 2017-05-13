import java.util.EmptyStackException;

public class ArrayStack3 {
	
	//implementa il tipo di dato astratto degli stack (versione 2: eccezioni)
	
	private int[] stk;
	private int top = -1;
	
	public ArrayStack3(int l) {
		stk = new int[l];
	}
	
	public int lunghezza(){
		return stk.length;
	}
	
	public void push(int v) throws FullMaxStackException{
		// inserisce un intero in cima allla pila... se c'è spazio
		
		if(top == stk.length -1) throw new FullMaxStackException(stk.length);
		top = top +1;
		stk[top] = v;
	}
	
	public int top() throws EmptyStackException{
		// estrae l'elemento in cima alla pila (e lo restituisce)... se esiste
		
		if(top<0) throw new EmptyStackException();
		top = top -1;
		return stk[top+1];
	}
}
