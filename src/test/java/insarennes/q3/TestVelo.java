package insarennes.q3;

import insarennes.q3.Guidon;
import insarennes.q3.Velo;
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
    void testGuidon(){
        velo.setGuidon(g);
        assertEquals(g, velo.getGuidon());
    }
}
