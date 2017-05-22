
public class DivisioneAsserts {
	public static void main(String[] args) {
		int a = 172, b = 37;
		int x = a, y = b, res = 0;
		assert (y >= 0 && x * y + res == a * b) : "invariant = " + (y >= 0 && x * y + res == a * b);
		// metodo delle invarianti
		while (y >= 1) {
			if (y % 2 == 0) {
				x = x + x;
				y = y / 2;
			} else {
				res = res + x;
				y = y - 1;
			}
			assert (y >= 0 && x * y + res == a * b);
		}
		assert (res == a * b);
		System.out.println(a + " * " + b + " = " + res);
	}
}
