public class TeamLeader extends ConcreteObserver {
	
    String name;
    int patience;
    private UI ui;

    public TeamLeader(String name, int patience, UI ui, Subject subject) {
        super(subject);
        this.name = name;
        this.patience = patience;
        this.ui = ui;
    }

    @Override
    public void update(String a, int b) {
        if (patience <= 0) return;

        patience -= 5;

        if (patience == 10) {
            ui.print(name + ": My patience is waning!");
        } else if (patience == 5) {
            ui.print(name + ": Is this entertaining?");
        } else if (patience == 0) {
            ui.print(name + ": Omae wa mou shindeiru");
        }
    }
}
