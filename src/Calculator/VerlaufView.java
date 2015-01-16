package Calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by skloppe on 16.01.2015.
 */
public class VerlaufView extends JFrame {
    /**
     * Attribute
     */
    private VerlaufModel verlaufModel;

    /**
     * Getter / Setter
     */
    public VerlaufModel getVerlaufModel() {
        return verlaufModel;
    }

    public void setVerlaufModel(VerlaufModel verlaufModel) {
        this.verlaufModel = verlaufModel;
    }

    /**
     * Init Verlauf Frame
     */
    public void initialise() {

        JTextArea taVerlauf = new JTextArea();
        taVerlauf.setFocusable(false);
        JScrollPane spVerlauf = new JScrollPane(taVerlauf);
        add(spVerlauf, BorderLayout.CENTER);

        for (String item : getVerlaufModel().getVerlaufGleichungen()) {
            taVerlauf.setText(taVerlauf.getText() + item + "\n");
        }

        //setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(300, 300);
        setTitle("Verlauf Calculator");
        setLocationByPlatform(true);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Schließt gesamte Anwendung
        setVisible(true);
    }
}