import java.util.Random;

public class Eren extends ConcreteSubject implements Runnable {
    private int energy;
    private UI ui;

    public Eren(int e, UI ui) {
        this.energy = e;
        this.ui = ui;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (energy != 0) {
            Random r = new Random();
            int low = 5;
            int high = 11;
            int result = r.nextInt(high - low) + low;

            try {
                Thread.sleep(result * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            energy -= 5;
            notifyObservers("Eren transformed! His remaining energy is ", energy);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
