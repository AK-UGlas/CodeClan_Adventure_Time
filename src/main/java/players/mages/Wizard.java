package players.mages;


import items.Spell;

public class Wizard extends Mage {

    private Spell spell;

    public Wizard(String name) {
        super(name);
        this.spell = new Spell("Fireball", 15);
    }

    public Spell getSpell() {
        return spell;
    }


}
