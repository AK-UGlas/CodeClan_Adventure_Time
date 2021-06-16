package items;

import behaviours.IHeal;

public class Potion extends Item implements IHeal {

    public Potion(SpellType type, int power) {
        super(type);
        setPower(power);
    }

    @Override
    public void heal() {

    }
}
