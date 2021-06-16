package items;

import behaviours.IHeal;
import players.Player;

public class Herbs extends Item implements IHeal {

    public Herbs(SpellType type, int power) {
        super(type);
        setPower(power);
    }

    @Override
    public void useItem(Player player) {
        heal(player);
    }

    @Override
    public void heal(Player player) {
        int newHealthPoints = player.getHealthPoints() + getPower();
        if (newHealthPoints > 100) {
            newHealthPoints = 100;
        }
        player.setHealthPoints(newHealthPoints);
    }
}
