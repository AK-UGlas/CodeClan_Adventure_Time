package items;

import behaviours.IHeal;

public class Herbs extends Item implements IHeal {

    public Herbs(SpellType type, int power) {
        super(type);
        setPower(power);
    }

    @Override
    public void heal() {

    }
}
