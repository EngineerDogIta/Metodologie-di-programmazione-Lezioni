
public class Pile {
	public static void main(String[] args) {
		// gioca con le pile 
		ArrayStack S = new ArrayStack();
		System.out.println("Ho creato uno stack lungo " + S.lunghezza());
		S.push(5);
		S.push(8);
		System.out.println(S.pop());
		System.out.println(S.pop());
		// System.out.println(S.pop()); // okkio!!
		
		S = new ArrayStack(2);
		System.out.println("ho creato uno stack lungo " + S.lunghezza());
		S.push(6);
		S.push(3);
		// S.push(1); // OKKIO!!!
	}
}
