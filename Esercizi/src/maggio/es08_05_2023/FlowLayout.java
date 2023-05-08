package maggio.es08_05_2023;

import javax.swing.*;
import java.awt.*;

public class FlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocation(100, 100);
        frame.setResizable(true);

        JPanel panel = new JPanel(new java.awt.FlowLayout());
        panel.setBackground(Color.GREEN);

        JLabel lab = new JLabel("Scegli un colore");

        JComboBox scelta = new JComboBox();
        scelta.addItem("Rosso");
        scelta.addItem("Verde");
        scelta.addItem("Blu");

        JButton btn = new JButton("Conferma");

        panel.add(lab);
        panel.add(scelta);
        panel.add(btn);

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
