package monopoly;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//WE ARE IN THE PLAYER CLASS
public class Player {
    int position;
    String name;
    boolean canGo;
    int money = 1_500;

    public Player(String name) {
        this.name = name;
    }

    void takeTurn() {
        System.out.println("[" + name + "]");

        showProperties();

        int firstRoll = roll();
        int secondRoll = roll();
        System.out.print("You rolled a " + firstRoll);
        System.out.println(" and a " + secondRoll);

        if (!canGo) {
            if (firstRoll == secondRoll) {
                canGo = true;
                move(firstRoll + secondRoll);
            }
            return;
        }

        move(firstRoll + secondRoll);

        while (firstRoll == secondRoll) {
            firstRoll = roll();
            secondRoll = roll();
            System.out.print("You rolled a " + firstRoll);
            System.out.println(" and a " + secondRoll);

            move(firstRoll + secondRoll);


        }

    }

    private void showProperties() {
        List<String> places = Arrays.stream(Board.places)
                .filter(place -> place instanceof Property)
                .filter(place -> ((Property) place).owner == this)
                .map(place -> place.name)
                .collect(Collectors.toList());
        System.out.println("You own " + places);
    }

    void move(int value) {
        position += value;
        if (position > 39) {
            position -= 40;
            money += 200;
            System.out.println("Collect 200 for passing Go!");
        }
        Place place = Board.places[position];
        System.out.println("You are on " + place.name);
        place.action(this);
        System.out.println("You have £" + money);
    }

    int roll() {
        return new Random().nextInt(6) + 1;

    }

    public static void main(String[] args) {


    }

}
