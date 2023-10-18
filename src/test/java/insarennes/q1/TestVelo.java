package insarennes.q1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVelo {
    Velo velo;
    @BeforeEach
    void setUp(){
        velo = new Velo();
    }

    @Test
    void testGuidon(){
        Guidon g = new Guidon();
        velo.setGuidon(g);
        assertEquals(g, velo.getGuidon());
    }
}
