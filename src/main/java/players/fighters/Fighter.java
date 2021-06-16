package players.fighters;

import behaviours.IWeapon;
import enemies.Enemy;
import items.Item;
import players.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IWeapon {

    private int attackPower;

    public Fighter(String name) {
        super(name);
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

//    public void attack(Enemy enemy) {
//
//    }

    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(this.attackPower);
        takeDamage(enemy.defend());
    }
}
