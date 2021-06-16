package players.fighters;

import behaviours.IWeapon;
import items.Item;
import players.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IWeapon {

    private int attackPower;

    public Fighter(String name, ArrayList<Item> bag) {
        super(name, bag);
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
