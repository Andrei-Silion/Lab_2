package map;

import java.util.List;

public class Benutzer {
    private String vorname;
    private String nachname;
    private List<Sport> sport;

    /**
     *
     * @param vorname attribut
     * @param nachname attribut
     * @param sport attribut
     */

    public Benutzer(String vorname, String nachname, List<Sport> sport) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.sport = sport;
    }

    /** konstruktor **/

    public double kalkuliere_zeit(){
        double zeit = 0;
        for (Sport sport : sport){
            zeit += sport.kalkuliere_zeit();
        }
        return zeit;
    }

    /** wir kalkulieren die Zeit fur jeder Sport **/

    public double kalkuliere_zeit(Sport sport) {
        return sport.kalkuliere_zeit();
    }

    /** wir kalkulieren die Zeit fur ein gegebenes Sport **/

    public double kalkuliere_durchschnitt() {
        double zeit = 0;
        for (Sport sport : sport){
            zeit += sport.kalkuliere_zeit();
        }
        return zeit/sport.size();
    }

    /** Durschscnittzeit **/

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setVorname(String vorname) {
        this.vorname=vorname;
    }

    public void setNachname(String nachname) {
        this.nachname=nachname;
    }

    public void setSport(List<Sport> sport) {
        this.sport=sport;
    }

}
