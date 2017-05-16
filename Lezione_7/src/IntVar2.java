
public class IntVar2 implements IntVar{

	// implementa le variabili intere... memorizzandole a capa sotto!
	
	private int valore;
	
	public int leggi () {
		return - valore;
	}
	
	public void scrivi (int valore) {
		this.valore = - valore;
	}
}