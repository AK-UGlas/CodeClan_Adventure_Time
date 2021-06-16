package players;

import behaviours.IHeal;

public class Cleric extends Player implements IHeal {

    private int healingPower = 20;

    public Cleric(String name) {
        super(name);
    }

    @Override
    public void heal(Player player) {
        int newHealthPoints = player.getHealthPoints() + healingPower;
        if (newHealthPoints > 100) {
            newHealthPoints = 100;
        }
        player.setHealthPoints(newHealthPoints);
    }
}
