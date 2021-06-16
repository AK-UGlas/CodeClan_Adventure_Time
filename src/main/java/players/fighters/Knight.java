package players.fighters;

import items.Item;

import java.util.ArrayList;

public class Knight extends Fighter {
    public Knight(String name, ArrayList<Item> bag) {
        super(name, bag);
        setAttackPower(10);
    }

    @Override
    public void attack() {

    }
}
