import java.util.EmptyStackException;

public class TestListStack {
	public static void main(String[] args) {
		//gioca con le pile fatte a lista
		
		ListStack l = new ListStack();
		System.out.println(l.is_empty());
		
		l.push(6);
		l.push(3);
		try {
			l.pop();
			//l.pop();
			System.out.println(l.pop());
		} catch (EmptyStackException e) {
			System.out.println("Stack vuoto!");
		}
	}
}
