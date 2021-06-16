package items;

public class Spell {

    private String name;
    private int power;

    public Spell(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}
