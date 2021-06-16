package playerTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import players.mages.Wizard;
import enemies.Ogre;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard("Wizzadora");
    }

    @Test
    public void hasName() {
        assertEquals("Wizzadora", wizard.getName());
    }

    @Test
    public void canDealDamage() {
        Ogre ogre = new Ogre();
        wizard.cast(wizard.getSpell(),ogre);
        assertEquals(60,ogre.getHealthPoints());
    }
}
