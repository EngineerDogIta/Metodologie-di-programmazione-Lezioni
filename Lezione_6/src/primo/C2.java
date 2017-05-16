package primo;

public class C2 extends C1 {
	/* un'altra classe */

	public int quarantadue = 42;

	public C2 (int a, int b, int q) {
		super(a, b);
		quarantadue = q;
	}
	
	public void stampami () {
		super.stampami();
		System.out.println("...e inoltre quarantadue = " + quarantadue);
	}
	
	public void stampaqualcosa () {
		System.out.println("C2");
	}
	
	public void blorg () {
		this.stampaqualcosa();
		super.stampaqualcosa();
	}
}
