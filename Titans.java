import java.util.Random;

public class Titans extends ConcreteObserver {
	
    private String name;
    private UI ui;
    private Random random = new Random();

    public Titans(String name, UI ui, Subject subject) {
        super(subject);
        this.name = name;
        this.ui = ui;
    }
    
    @Override
    public void update(String a, int b) {
        if (random.nextBoolean()) {
            ui.print(name + " attacks Eren!");
            if (b > 40) {
                ui.print(name +": Now we got problems, and I don't think we can solve 'em.");
            }
        }
    }
}
