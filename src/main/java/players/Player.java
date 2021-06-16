package players;

import items.Item;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthPoints;
    private ArrayList<Item> bag;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.bag = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }

    public void addItemToBag(Item item) {
        this.bag.add(item);
    }

    public void useItem(Item item) {
        item.useItem(this);
    }
}
