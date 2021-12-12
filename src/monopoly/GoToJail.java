package monopoly;

public class GoToJail extends Place{

    public GoToJail(String name) {
        super(name);
    }


    void action(Player player) {
        player.position = 10;
        player.canGo = false;
        System.out.println("Go jail noob (┛◉Д◉)┛彡┻━┻ ");
    }
}
