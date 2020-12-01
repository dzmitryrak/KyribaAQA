package aqa4;

public class AQA4 {

    public static void main(String[] args) {
        Team team1 = new Team("LI");
        Team team2 = new Team("IRQA");
        team1.displayInfo();
        team2.displayInfo();

        Team team3 = new Team("PY", "Михаил");
        team3.displayInfo();

        PC pc = new PC();
        pc.enable(1);
    }
}
