/**
 * Created by pietrocenciarelli on 27/04/17.
 */
public class Popper extends Thread {

    private ArrayStack stack;
    public Popper (ArrayStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("frittata!");
        } catch (InterruptedException e) {
            System.out.println("Dormivo...");
        }
    }
}
