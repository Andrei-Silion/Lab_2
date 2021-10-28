package map;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sport fusball= new Fussball();
        Sport hochsprung= new Hochsprung();
        Sport basketball = new Basketball();
        Sport hindernislauf = new Hindernislauf();
        Benutzer benutzer= new Benutzer("MIREL","RADOI", Arrays.asList(basketball,hindernislauf,fusball,hochsprung));

        Testing();

        Sport jump = new Hochsprung();
        System.out.println(benutzer.kalkuliere_zeit());
        System.out.println(benutzer.kalkuliere_durchschnitt());
        System.out.println(benutzer.kalkuliere_zeit(fusball));

    }

    public static void Testing(){
        BenutzerTest test = new BenutzerTest();
        test.kalkuliere_durchschnitt();
        test.kalkuliere_zeit();
    }




    }

