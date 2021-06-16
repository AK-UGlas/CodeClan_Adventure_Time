package behaviours;

import enemies.Enemy;
import items.Spell;

public interface ISpell {

    public void cast(Spell spell, Enemy enemy);
}
