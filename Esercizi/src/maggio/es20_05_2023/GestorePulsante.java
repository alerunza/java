package maggio.es20_05_2023;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorePulsante implements ActionListener {
    private JTextArea a;

    public GestorePulsante(JTextArea a) {
        this.a = a;
    }

    public void actionPerformed(ActionEvent e) {
        String pulsante = e.getActionCommand();
        if (pulsante.equals("Superiore")) {
            a.append(" stato premuto il pulsante *superiore*.");
        }
        if (pulsante.equals("Inferiore")) {
            a.append(" stato premuto il pulsante *inferiore*.");
        }
    }
}
