package players;

public abstract class Player {

    private String name;
    private int healthPoints;
    private ArrayList<Item> bag;

    public Player(String name, int healthPoints, ArrayList<Item> bag) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.bag = bag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public ArrayList<Item> getBag() {
        return bag;
    }

    public void setBag(ArrayList<Item> bag) {
        this.bag = bag;
    }
}
