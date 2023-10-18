package insarennes.exo2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestForet {
    Foret foret;
    Chene c1, c2, c3;
    Pin p1, p2, p3;
    @BeforeAll
    void setUp(){
        foret = new Foret();
        c1 = new Chene(30.0, 233.0);
        c2 = new Chene(10.0, 3.0);
        c3 = new Chene(22.0, 300.0);

        p1 = new Pin(2.0, 30.0);
        p2 = new Pin(7.0, 42.0);
        p3 = new Pin(27.0, 141.0);
    }

    @Test
    void testPlanterArbre(){
        foret.planterArbre(c1);
        foret.planterArbre(c2);
        foret.planterArbre(p1);

        assertEquals(List.of(c1,c2,p1), foret.getArbres());
    }

    @Test
    void getPrixTotal(){
        assertEquals(0, foret.getPrixTotal());
        foret.planterArbre(c1);
        int prix1 = c1.getPrix();
        foret.planterArbre(c2);
        int prix2 = c2.getPrix();
        foret.planterArbre(c3);
        int prix3 = c3.getPrix();
        assertEquals(prix1 + prix2 + prix3, foret.getPrixTotal());
    }

    @Test
    void testCouperArbre(){
        foret.planterArbre(c1);
        foret.planterArbre(c2);
        foret.planterArbre(p1);

        assertEquals(List.of(c1,c2,p1), foret.getArbres());

        foret.couperArbre(c2);
        assertEquals(List.of(c1,p1), foret.getArbres());

        foret.couperArbre(p1);
        assertEquals(List.of(c1), foret.getArbres());

        foret.couperArbre(c1);
        assertTrue(foret.getArbres().isEmpty());
    }

    @Test
    void testNbChene(){
        foret.planterArbre(c1);
        foret.planterArbre(c2);
        foret.planterArbre(p1);

        assertEquals(2, foret.getNombreChene());

    }
}
