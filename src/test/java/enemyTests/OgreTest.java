package enemyTests;

import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Knight;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    Ogre ogre;

    @Before
    public void before() {
        ogre = new Ogre();
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(75, ogre.getHealthPoints());
    }
    @Test
    public void hasDefendPoints(){
        assertEquals(10,ogre.getDefendPoints());
    }

    @Test
    public void canDefend() {
        Knight knight = new Knight("Sir Allen of Kilbride");
        knight.attack(ogre);
        assertEquals(90, knight.getHealthPoints());
    }
}
