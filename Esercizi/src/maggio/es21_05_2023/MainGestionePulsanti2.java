package maggio.es21_05_2023;

import javax.swing.*;
import java.awt.*;

public class MainGestionePulsanti2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);
        frame.setLocation(100, 100);
        frame.setTitle("Pulsante Tizio/Caio");

        JPanel panel = new JPanel(new FlowLayout());
        JLabel lab = new JLabel("Tizio");
        JButton btn = new JButton("Tizio/Caio");

        panel.add(lab);
        panel.add(btn);

        btn.addActionListener(new GestorePulsante2(lab));

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
