package playerTests;

import enemies.Goblin;
import enemies.Ogre;
import items.Herbs;
import items.Potion;
import items.SpellType;
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

    @Test
    public void canUseItem() {
        Potion potion = new Potion(SpellType.HEALING, 5);
        Ogre ogre = new Ogre();
        barb.attack(ogre);
        barb.useItem(potion);
        assertEquals(95, barb.getHealthPoints());
    }

    @Test
    public void canAddItemToBag(){
        Herbs herbs = new Herbs(SpellType.HEALING, 10);
        barb.addItemToBag(herbs);
        assertEquals(1,barb.getBagItemCount());

    }
}
