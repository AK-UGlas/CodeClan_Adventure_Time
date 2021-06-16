package playerTests;

import enemies.Dragon;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.fighters.Knight;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){ cleric = new Cleric("Clive Clerician");}

    @Test
    public void hasName(){
        assertEquals("Clive Clerician", cleric.getName());
    }

    @Test
    public void canHeal(){
        Knight knight = new Knight("Sir Allen of Kilbride");
        Dragon dragon = new Dragon();
        knight.attack(dragon);
        cleric.heal(knight);
        assertEquals(80,knight.getHealthPoints());
    }
}
