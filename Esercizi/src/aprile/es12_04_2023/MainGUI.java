package aprile.es12_04_2023;

import java.awt.*;
import javax.swing.*;

public class MainGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel p = new JPanel();

        JLabel lab = new JLabel("Etichetta");

        JButton btnlab = new JButton("Bottone con Etichetta");
        JButton btn = new JButton();

        JTextField tf = new JTextField(35);
        JTextField tfName = new JTextField("Immetti il nome", 20);

        JTextArea taDesc = new JTextArea(5, 20);
        JTextArea taList = new JTextArea(5, 20);

        JCheckBox cb1 = new JCheckBox();
        JCheckBox cb2 = new JCheckBox("Testo");
        JCheckBox cb3 = new JCheckBox("Testo Attivato");

        JRadioButton rb1 = new JRadioButton("Lingua Francese");
        JRadioButton rb2 = new JRadioButton("Lingua Francese");

        /* button with label */
        btnlab.setOpaque(true);
        btnlab.setBorderPainted(false);
        btnlab.setBackground(Color.cyan);

        /* button */
        btn.setText("Bottone");

        /* JTextArea */
        taDesc.setText("Dimensionata con 5 righe e 20 colonne");
        taList.setText("Immetti una lista di nomi");

        /* add components in the panel */
        p.add(lab);
        p.add(btnlab);
        p.add(btn);
        p.add(tf);
        p.add(tfName);
        p.add(taDesc);
        p.add(taList);
        p.add(cb1);
        p.add(cb2);
        p.add(cb3);
        p.add(rb1);
        p.add(rb2);

        Container c = f.getContentPane();
        c.add(p);

        f.setSize(480,400);

        f.setVisible(true);

    }
}
