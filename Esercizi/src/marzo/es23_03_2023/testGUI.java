package marzo.es23_03_2023;

import javax.swing.*;
import java.awt.*;

public class testGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JPanel p = new JPanel();

        JLabel l = new JLabel("Etichetta");

        JButton b = new JButton("Bottone");

        p.add(l);

        p.add(b);

        Container c = f.getContentPane();

        c.add(p);

        f.setSize(600,200);

        f.setVisible(true);
    }
}