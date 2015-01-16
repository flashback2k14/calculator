package Calculator;

import java.util.ArrayList;

/**
 * Created by flashback2k14 on 16.01.2015.
 */
public class VerlaufModel {
    /**
     * Attribute
     */
    private ArrayList<String> verlaufGleichungen = new ArrayList<>();

    /**
     * Getter / Setter
     */
    public ArrayList<String> getVerlaufGleichungen() {
        return this.verlaufGleichungen;
    }

    /**
     * add Item to Verlauf
     */
    public void addItemToVerlauf(String gleichung) {
        this.verlaufGleichungen.add(gleichung);
    }
}