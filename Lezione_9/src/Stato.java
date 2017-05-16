
public class Stato {

	public String nome;
	public String valuta;
	public int riserveAuree;
	public int monetaStampata = 0;
	
	public class Moneta {
		int valore;
		
		public Moneta (int valore) {
			this.valore = valore; // this denota l'oggetto "interno"
			(Stato.this).monetaStampata = Stato.this.monetaStampata + valore;
			// Stato.this denota l'oggetto "esterno"
		}
		
		public void stampaValore () {
			System.out.println("Banca di " + nome);
			System.out.print( valore + " " + valuta);
			System.out.println(" (valore in oro: " + (Stato.this).valoreInOro(this) + " Kg)");
		}
	}
	
	public Stato (String nome, String valuta, int riserveAuree) {
		this.nome = nome;
		this.valuta = valuta;
		this.riserveAuree = riserveAuree;
	}
	
	public int valoreInOro (Moneta m) {
		return ((riserveAuree * m.valore)/monetaStampata);
	}
	
	public Moneta conia (int v) {
		return new Moneta(v);
	}

}