package playerTests;

import enemies.Goblin;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barb;

    @Before
    public void before() {
        barb = new Barbarian("Colin the Barbarian");
    }

    @Test
    public void hasName() {
        assertEquals("Colin the Barbarian", barb.getName());
    }

    @Test
    public void hasPowerLevel() {
        assertEquals(20, barb.getAttackPower());
    }

    @Test
    public void canAttack() {
        Goblin goblin = new Goblin();
        barb.attack(goblin);
        assertEquals(5, goblin.getHealthPoints());
    }

}
