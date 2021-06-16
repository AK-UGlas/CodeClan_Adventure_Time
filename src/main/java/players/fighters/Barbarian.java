package players.fighters;

import items.Item;

import java.util.ArrayList;

public class Barbarian extends Fighter {

    public Barbarian(String name, ArrayList<Item> bag) {
        super(name, bag);
        setAttackPower(20);
    }


    @Override
    public void attack() {

    }
}
