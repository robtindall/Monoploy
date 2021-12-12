package monopoly;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class
Game {
    static List<Player> players = new ArrayList<>();

    static {
        players.add(new Player("Jimmothy"));
        players.add(new Player("Player 2"));
        players.add(new Player("Player 3"));
        players.add(new Player("Player 4"));
        players.add(new Player("Player 5"));
        players.add(new Player("Player 6"));
    }

    public static void main(String[] args) throws IOException {
        Game game = new Game();
        game.play();
    }

    private void play() throws IOException {
        int playerIndex = 0;
        while (true) {
            Player player = players.get(playerIndex);
            player.takeTurn();
            if (player.money < 0) {
                players.remove(player);
                System.out.println(player.name + " is out (◕︵◕)");
                if (players.size() == 1) {
                    System.out.println();
                    System.out.println(players.get(0).name + " has won (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧");
                    return;
                }
            }
            playerIndex++;
            if (playerIndex >= players.size()) {
                playerIndex = 0;
            }
            System.in.read();
        }
    }
}
