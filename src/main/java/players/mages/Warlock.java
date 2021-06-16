package players.mages;

import items.Spell;

public class Warlock extends Mage {

    private Spell spell;

    public Warlock(String name) {
        super(name);
        spell = new Spell("leech", 10);
    }

    public Spell getSpell() {
        return spell;
    }
}
