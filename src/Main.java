/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 11:36 AM
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();
        System.out.println("Number 1 HashCode=" + numberGenerator1.hashCode());
        System.out.println("Number 2 HashCode=" + numberGenerator2.hashCode());
        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);
        thread2.setPriority(10);
        thread1.setPriority(5);
        thread1.start();
        thread2.start();
    }
}
