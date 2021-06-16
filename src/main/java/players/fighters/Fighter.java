package players.fighters;

import behaviours.IWeapon;
import items.Item;
import players.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IWeapon {

    public Fighter(String name, ArrayList<Item> bag) {
        super(name, bag);
    }
}
