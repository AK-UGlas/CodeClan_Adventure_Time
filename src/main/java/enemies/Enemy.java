package enemies;

import behaviours.IDefend;

public abstract class Enemy implements IDefend {

    private int healthPoints;
    private int defendPoints;

    public Enemy() {
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setDefendPoints(int defendPoints) {
        this.defendPoints = defendPoints;
    }

    public int getDefendPoints() {
        return defendPoints;
    }

    public void takeDamage(int damageTaken) {
        this.healthPoints -= damageTaken;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public int defend() {
        return defendPoints;
    }
}
