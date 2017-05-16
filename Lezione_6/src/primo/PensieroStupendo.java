package primo;
import secondo.Potenze;

public class PensieroStupendo extends Potenze {
	// estende una classe che appartiene ad un altro package
	// prova di accesso alle potenze di due; mostra la differenza
	// fra private e protected
	
	public void stampapotenze () {
		System.out.println(allanona);
		// System.out.println(alladecima); // NO: attributo private!
		System.out.println(allundicesima); // OK: attributo protected!
	}

}