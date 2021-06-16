package playerTests;

import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import players.mages.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock("Wally the Warlock");
    }

    @Test
    public void hasName() {
        assertEquals("Wally the Warlock", warlock.getName());
    }

    @Test
    public void canDealDamage() {
        Ogre ogre = new Ogre();
        warlock.cast(warlock.getSpell(), ogre);
        assertEquals(65, ogre.getHealthPoints());
    }
}
