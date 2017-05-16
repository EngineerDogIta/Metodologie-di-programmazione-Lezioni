package Pac3;

public class ReverseStack {

	private static void dump(Stack s1, Stack s2) throws EmptyStackException, FullStackException {
		// scarica il contenuto di s1 in s2... 'a coppa abbascio

		while (!s1.is_empty())
			s2.push(s1.pop());
	}

	public static void reverse(Stack s) throws EmptyStackException, FullStackException {
		// gli ultimi (di s) saranno i primi (ordinatamente); usa dump

		ListStack tmp1 = new ListStack();
		ListStack tmp2 = new ListStack();
		dump(s, tmp1);
		dump(tmp1, tmp2);
		dump(tmp2, s);
	}

	public static void main(String[] args) throws EmptyStackException, FullStackException {
		/*
		 * Uso delle interfacce testa la reverse su due diverse implementazioni
		 * di stack
		 */

		ListStack L = new ListStack();
		ArrayStack L2 = new ArrayStack();

		L.push(7);
		L.push(9);
		L.push(42);
		L.printStack();

		L2.push(55);
		L2.push(44);
		reverse(L2); // invertito un ListStack

		reverse(L);
		L.printStack();

		reverse(L2); // invertito un ArrayStack
		// L2.printStack(); // non posso stampare: manca il metodo in ArrayStack
	}

}
