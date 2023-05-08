package maggio.es08_05_2023;

import java.awt.*;
import javax.swing.*;

public class GUI1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anagrafica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 120);
        frame.setResizable(true);
        frame.setLocation(100, 100);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.setBackground(Color.RED);

        JLabel lab = new JLabel("Nome");
        JLabel lab2 = new JLabel("Cognome");
        JLabel lab3 = new JLabel("Telefono");
        JLabel lab4 = new JLabel("Indirizzo");

        JTextField nome = new JTextField(5);
        JTextField cognome = new JTextField(5);
        JTextField telefono = new JTextField(5);
        JTextField indirizzo = new JTextField(5);

        JRadioButton m = new JRadioButton("M");
        JRadioButton f = new JRadioButton("F");

        JButton btn = new JButton("OK");

        panel.add(lab);
        panel.add(nome);
        panel.add(lab2);
        panel.add(cognome);
        panel.add(lab3);
        panel.add(telefono);
        panel.add(lab4);
        panel.add(indirizzo);
        panel.add(m);
        panel.add(f);
        panel.add(btn);

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
