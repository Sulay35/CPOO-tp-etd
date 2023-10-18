package insarennes.q5;

import insarennes.q5.Roue;
import insarennes.q5.Velo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVelo {
    Velo velo;
    Roue r1,r2,r3;

    @BeforeEach
    void setUp(){
        velo = new Velo();
        r1 = new Roue();
        r2 = new Roue();
        r3 = new Roue();
    }

    @Test
    void testAddRoues(){
        velo.addRoue(r1);
        velo.addRoue(r2);
        velo.addRoue(r3);

        Collection<Roue> collR = Arrays.asList(r1, r2, r3);

        assertEquals(collR,velo.getRoues());
    }

    @Test
    void testGetSetRoue(){
        velo.addRoue(r1);
        velo.addRoue(r2);
        velo.addRoue(r3);

        assertEquals(velo, r1.getVelo());
        assertEquals(velo, r2.getVelo());
        assertEquals(velo, r3.getVelo());
    }
}
