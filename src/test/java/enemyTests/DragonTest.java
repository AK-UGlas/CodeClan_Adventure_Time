package enemyTests;

import enemies.Dragon;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Knight;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before() {
        this.dragon = new Dragon();
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, dragon.getHealthPoints());
    }

    @Test
    public void hasDefendPoints(){
        assertEquals(40, dragon.getDefendPoints());
    }

    @Test
    public void canDefend() {
        Knight knight = new Knight("Sir Allen of Kilbride");
        knight.attack(dragon);
        assertEquals(60, knight.getHealthPoints());
    }
}
