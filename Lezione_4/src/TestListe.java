
public class TestListe {
	public static void main(String[] args) {
		//gioca con le liste
		
		IntList l1 = new IntList(1,  new IntList(9, new IntList(5, null)));
		IntList l2 = new IntList(3, new IntList(7, null));
		l2.concat(l1);
		l2.stampalista(4);
		l2.stampalista(10);
		l2.luppa();
		l2.stampalista(50);
	}
}
