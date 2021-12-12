package monopoly;

public class Tax extends Place{

    int charge;

    public Tax(String name, int charge) {
        super(name);
        this.charge = charge;
    }

    void action(Player player) {
        player.money -= charge;
    }
}
