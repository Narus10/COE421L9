import java.util.Random;

public class Friends extends ConcreteObserver {
	
    private String name;
    private UI ui;
    private Random random = new Random();

    public Friends(String name, UI ui, Subject subject) {
        super(subject);
        this.name = name;
        this.ui = ui;
    }
    
    @Override
    public void update(String a, int b) {
        if (random.nextBoolean()) {
            ui.print(name + ": eren please be safe!");
        }
        if (b < 20) {
            ui.print(name + ": Rage, rage against the dying of the light.");
        }
    }
}
