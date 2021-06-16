package enemyTests;

import enemies.Goblin;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Knight;

import static org.junit.Assert.assertEquals;

public class GoblinTest {

       Goblin goblin;

        @Before
        public void before() {
            goblin = new Goblin();
        }

        @Test
        public void hasHealthPoints(){
            assertEquals(25, goblin.getHealthPoints());
        }
        @Test
        public void hasDefendPoints(){
            assertEquals(5,goblin.getDefendPoints());
        }

        @Test
        public void canDefend() {
            Knight knight = new Knight("Sir Allen of Kilbride");
            knight.attack(goblin);
            assertEquals(95, knight.getHealthPoints());
        }
}
