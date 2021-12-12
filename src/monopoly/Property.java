package monopoly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Property extends Place {
    PropertyType type;
    Player owner;
    int buyPrice = 100;
    int rent = 1000;

    public Property(String name, PropertyType type) {
        super(name);
        this.type = type;
    }

    void action(Player player) {
        if (owner == null) {
            System.out.println("You landed on " + name + ". Do you wish to buy it for " + buyPrice);
            if(getAnswer().equals("y")) {
                owner = player;
                player.money -= buyPrice;
                System.out.println("You just bought " + name + " for £" + buyPrice + " make sure to say thank you!");
            }
        } else {
            player.money -= rent;
            owner.money += rent;
            System.out.println("You need to pay £" + rent + " in rent. Have a nice stay!");
        }
    }

    private String getAnswer() {
        try {
            return new BufferedReader(
                    new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            return "";
        }
    }

}
