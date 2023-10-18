package insarennes.q2;

import insarennes.q2.Guidon;
import insarennes.q2.Velo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVelo {
    Velo velo;
    Guidon g;
    @BeforeEach
    void setUp(){
        velo = new Velo();
        g = new Guidon();
    }

    @Test
    void testGuidonVelo(){
        velo.setGuidon(g);
        assertEquals(g, velo.getGuidon());
        assertEquals(velo, g.getVelo());
    }
}
