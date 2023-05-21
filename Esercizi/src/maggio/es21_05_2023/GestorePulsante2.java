package maggio.es21_05_2023;

import maggio.es20_05_2023.GestorePulsante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorePulsante2 implements ActionListener {
    private JLabel lab;

    public GestorePulsante2(JLabel l){
        this.lab = l;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.lab.getText().equals("Tizio")){
            this.lab.setText("Caio");
        } else{
            this.lab.setText("Tizio");
        }
    }
}
