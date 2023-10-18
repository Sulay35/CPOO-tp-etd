package insarennes.exo2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestArbre {
    Chene chene;
    Pin pin;
    @BeforeAll
    void  setUp(){
       chene = new Chene();
       pin = new Pin();
    }

    @Test
    void testGetSetChene(){
        chene.setAge(10);
        chene.setVolume(50.5);
        assertEquals(10,chene.getAge());
        assertEquals(50.5,chene.getVolume());

    }

    @Test
    void testGetSetPin(){
        pin.setAge(10);
        pin.setVolume(51.5);
        assertEquals(10,pin.getAge());
        assertEquals(51.5,pin.getVolume());
    }

    @Test
    void testConstructeur(){
        Chene c = new Chene(40.0, 190.0);
        assertEquals(40.0,c.getAge());
        assertEquals(190.0,c.getVolume());
    }

    @Test
    void testViellir(){
        Chene c = new Chene(40.0, 190.0);
        c.viellir();
        assertEquals(41.0,c.getAge());
    }

    @Test
    void testGetPrix(){
        Chene c = new Chene(40.0, 190.0);
        assertEquals(190000.0,c.getPrix());

        Pin p = new Pin(3.0, 22.0);
        assertEquals(22 * 500.0,p.getPrix());
    }

    @Test
    void testPeutEtreCoupe(){
        Chene c = new Chene(40.0, 190.0);

        assertTrue(c.peutEtreCoupe());

        Pin p = new Pin(3.0, 22.0);

        assertFalse(p.peutEtreCoupe());
    }


}
