import static java.lang.Thread.MAX_PRIORITY;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 11:31 AM
 */
public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + this.hashCode());
            System.out.println("Priority: " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
