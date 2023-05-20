package maggio.es20_05_2023;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGestionePulsanti {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);
        frame.setLocation(100, 100);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.GREEN);

        JButton btn1 = new JButton("Superiore"), btn2 = new JButton("Inferiore");
        JTextArea textArea = new JTextArea(50, 10);

        // Non è scrivibile la TextArea
        textArea.setEditable(false);

        panel.add(btn1, BorderLayout.NORTH);
        panel.add(textArea, BorderLayout.CENTER);
        panel.add(btn2, BorderLayout.SOUTH);

        btn1.addActionListener(new GestorePulsante(textArea));
        btn2.addActionListener(new GestorePulsante(textArea));

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
