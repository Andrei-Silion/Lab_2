package map;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {
    private Benutzer benutzer;

    public BenutzerTest(){}

    @Test
    void kalkuliere_zeit() {
        Sport fusball= new Fussball();
        Sport hochsprung= new Hochsprung();
        Sport basketball = new Basketball();
        Sport hindernislauf = new Hindernislauf();
        Benutzer benutzer= new Benutzer("MIREL","RADOI", Arrays.asList(basketball,hindernislauf,fusball,hochsprung));
        Assertions.assertEquals(benutzer.kalkuliere_zeit(),benutzer.kalkuliere_zeit(basketball)+benutzer.kalkuliere_zeit(hindernislauf)+benutzer.kalkuliere_zeit(fusball)+benutzer.kalkuliere_zeit(hochsprung));

    }

    @Test
    void testKalkuliere_zeit() {
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        Benutzer benutzer= new Benutzer("MIREL","RADOI", Arrays.asList(fussball,hindernislauf));
        Assertions.assertEquals(benutzer.kalkuliere_zeit(fussball),65);
        Assertions.assertEquals(benutzer.kalkuliere_zeit(hindernislauf),30);
    }

    @Test
    void kalkuliere_durchschnitt() {
        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Benutzer benutzer= new Benutzer("MIREL","RADOI", Arrays.asList(basketball,fussball));
        Assertions.assertEquals(benutzer.kalkuliere_durchschnitt(),60);
    }
}