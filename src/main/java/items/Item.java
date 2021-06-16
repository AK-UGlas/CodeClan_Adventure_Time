package items;

public abstract class Item {

    private int power;
    private SpellType type;

    public Item(SpellType type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public SpellType getSpellType() {
        return this.type;
    }
}
