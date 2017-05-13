import java.util.EmptyStackException;

public class ArrayStack2 {
	
	//implementa il tipo di dato astratto degli stack (versione 2: eccezioni)
	
	private int[] stk;
	private int top = -1;
	
	ArrayStack2(int l){
		stk = new int[l];
	}
	
	public int lunghezza(){
		return stk.length;
	}
	
	public void  push(int v) throws FullStackException{
		//inserisce un intero in cima alla pila.. se c'è spazio!
		
		if(top == stk.length - 1) throw new FullStackException();
		top = top +1;
		stk[top] = v;
	}
	
	public int pop() throws EmptyStackException{
		//estrae l'elemento in cima alla pila (e lo restituisce)... se esiste!
		
		if(top < 0) throw new EmptyStackException();
		top = top -1;
		return stk[top+1];
				
	}
}
