public class Driver {
    public static void main(String[] args) {
        UI ui = new UI();

        // Initialize Eren with 50 energy
        Eren e = new Eren(50, ui);

        // Initialize Team Leader with 20 patience
        TeamLeader Levi = new TeamLeader("Levi Ackerman", 20, ui, e);

        // Initialize Friends
        Friends Mikasa = new Friends("Mikasa", ui, e);
        Friends Armin = new Friends("Armin", ui, e);

        // Initialize Titans
        Titans Armor = new Titans("Armored Titan", ui, e);
        Titans Colossal = new Titans("Colossal Titan", ui, e);
    }
}
