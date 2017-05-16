package Pac3;

public class ArrayStack {
	private final static int SIZE = 10;
	private int[] stk;
	private int top = -1;
	
	ArrayStack(){
		stk = new int[SIZE];
	}
	
	public ArrayStack(int i) {
		// TODO Auto-generated constructor stub
	}

	public int lunghezza(){
		return stk.length;
	}
	
	public void push(int v){ // inserisce un intero in cima alla pila
		top = top +1;
		stk[top] = v;
	}
	
	public int pop(){ // estrae l'elemento in cima alla pila e la restituisce
		top = top -1;
		return stk[top+1];		
	}
}
