import java.util.EmptyStackException;

public class Pile2 {
	public static void main(String[] args) {
		// gioca con le pile e con le eccezioni
		
		ArrayStack2 S = new ArrayStack2(4);
		ArrayStack3 SSS = new ArrayStack3(2);
		
		try {
			S.push(5);
			System.out.println(S.pop());
			// System.out.println(S.pop()); // lancia l'eccezione stack vuoto!
			S.push(6);
			S.push(7);
			S.push(8);
			S.push(9);
			S.push(10);
		} catch (FullStackException f) {
			System.out.println("Lo stack è pieno!");
		} catch (EmptyStackException e) {
			System.out.println("lo stack è vuoto!");
		}
		
		try {
			SSS.push(5);
			SSS.push(6);
			//SSS.push(7);
		} catch (FullMaxStackException m) {
			System.out.println("Lo stack ha solo " + m.lung + " posti!");
		}
		System.out.println("That's all folks");
	}
}
