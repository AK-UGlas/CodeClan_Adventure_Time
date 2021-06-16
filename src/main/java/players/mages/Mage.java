package players.mages;

import behaviours.IDefend;
import behaviours.ISpell;
import enemies.Enemy;
import items.Spell;
import players.Player;

public abstract class Mage extends Player implements IDefend, ISpell {

    public Mage(String name) {
        super(name);
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public void cast(Spell spell, Enemy enemy) {
        enemy.takeDamage(spell.getPower());
    }
}
