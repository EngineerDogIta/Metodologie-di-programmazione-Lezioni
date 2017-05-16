
public class Echo {

	public static void main(String[] args) {
		// Stampa i parametri che vengono passati al mail (args[])
		
		for (int i = 0; i < args.length; ++i)
			System.out.print(args[i] + " ");
		System.out.println();
		System.out.print("la lunghezza è: " + args.length);

	}

}