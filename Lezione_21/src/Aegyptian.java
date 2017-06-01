/**
 * Created by pietrocenciarelli on 21/05/17.
 */
public class Aegyptian {

    // moltiplicazione egiziana con asserzioni. Metodo delle invarianti.

    public static void main(String[] args) {

        int a = 172;
        int b = 37;
        // int b = -37;

        int x = a, y = b, res = 0;

        assert (y >= 0 && x * y + res == a * b): "invariant = " + (x * y + res == a * b);
        // assert (x * y + res == a * b): "invariant = " + (x * y + res == a * b);

        while (y >= 1) {
            if (y % 2 == 0) {
                x = x + x;
                y = y/2;
            }
            else {
                res = res + x;
                y = y - 1;
            }
            assert (y >= 0 && x * y + res == a * b); // loop invariant
        }
        assert (res == a * b): "senza quest'asserzione: 172 * -37 = 0!";
        System.out.println(a + " * " + b + " = " + res);
    }
}
