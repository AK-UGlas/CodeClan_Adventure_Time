package playerTests;

import enemies.Goblin;
import enemies.Ogre;
import items.Potion;
import items.SpellType;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before() {
        knight = new Knight("Sir Gordon of Lilley");
    }

    @Test
    public void hasName() {
        assertEquals("Colin the Barbarian", knight.getName());
    }

    @Test
    public void hasPowerLevel() {
        assertEquals(10, knight.getAttackPower());
    }

    @Test
    public void canAttack() {
        Goblin goblin = new Goblin();
        knight.attack(goblin);
        assertEquals(15, goblin.getHealthPoints());
    }

    @Test
    public void canUseItem() {
        Potion potion = new Potion(SpellType.HEALING, 5);
        Ogre ogre = new Ogre();
        knight.attack(ogre);
        knight.useItem(potion);
        assertEquals(95, knight.getHealthPoints());
    }
}
