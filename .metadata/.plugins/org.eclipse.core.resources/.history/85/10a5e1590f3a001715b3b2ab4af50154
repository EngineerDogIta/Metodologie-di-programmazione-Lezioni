package Pac3;

public class IntList {
	// liste di interi; GREZZO!!
	
	public int head;
	public IntList tail;
	
	IntList(int h, IntList t){
		this.head = h;
		tail = t;
	}
	
	public void stampalista(int n){
		// stampa la lista, ma non oltre l'n-esimo elemento
		
		if (n<=0) {
			System.out.println();
			return;
		}
		System.out.println(head + " ");
		if (tail == null){
		System.out.println();
		}else{
			tail.stampalista(n-1);
		}
	}
	public void concat(IntList l) {
		// concatena this con l
		
		if (tail == null) {
			tail = l;
		}else {
			tail.concat(l);
		}
	}
	public void luppa() {
		// concatena this a se stesso. Si crea un loop!
		
		concat(this);

	}
}
