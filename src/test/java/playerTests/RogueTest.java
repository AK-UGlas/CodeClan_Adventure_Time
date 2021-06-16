package playerTests;

import enemies.Goblin;
import enemies.Ogre;
import items.Potion;
import items.SpellType;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Rogue;

import static org.junit.Assert.assertEquals;



public class RogueTest {

    Rogue rogue;

    @Before
    public void before() {
        rogue = new Rogue("Roosa the rogue");
    }

    @Test
    public void hasName() {
        assertEquals("Roosa the rogue", rogue.getName());
    }

    @Test
    public void hasPowerLevel() {
        assertEquals(15, rogue.getAttackPower());
    }

    @Test
    public void canAttack() {
        Goblin goblin = new Goblin();
        rogue.attack(goblin);
        assertEquals(10, goblin.getHealthPoints());
    }

    @Test
    public void canUseItem() {
        Potion potion = new Potion(SpellType.HEALING, 5);
        Ogre ogre = new Ogre();
        rogue.attack(ogre);
        rogue.useItem(potion);
        assertEquals(95, rogue.getHealthPoints());
    }

}

