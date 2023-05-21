import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaATM {
    public static double saldo = 500; // Saldo iniziale
    public static JTextField campoImporto;
    public static JLabel labelSaldo;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema ATM");
        // Se chiudiamo tramite la X in alto, stopperà il programma
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Posizione della finestra al centro dello schermo
        frame.setLocationRelativeTo(null);
        // Non è possibile dimensionare la finestra ai bordi di essa
        frame.setResizable(false);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel labelImporto = new JLabel("Importo:");
        panel.add(labelImporto);

        campoImporto = new JTextField();
        panel.add(campoImporto);

        JButton pulsantePreleva = new JButton("Preleva");
        pulsantePreleva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (campoImporto.getText().isEmpty()) {
                    mostraMessaggioErrore("Inserisci un importo");
                    return;
                }
                double importo = getImportoDaCampo();
                preleva(importo);
            }
        });
        panel.add(pulsantePreleva);

        JButton pulsanteDeposita = new JButton("Deposita");
        pulsanteDeposita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (campoImporto.getText().isEmpty()) {
                    mostraMessaggioErrore("Inserisci un importo");
                    return;
                }
                double importo = getImportoDaCampo();
                deposita(importo);
            }
        });
        panel.add(pulsanteDeposita);

        JLabel labelTestoSaldo = new JLabel("Saldo:");
        panel.add(labelTestoSaldo);

        labelSaldo = new JLabel(saldo + "€");
        panel.add(labelSaldo);

        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static double getImportoDaCampo() {
        String testoImporto = campoImporto.getText();
        // da String a Double -- parse
        return Double.parseDouble(testoImporto);
    }

    public static void preleva(double importo) {
        if (importo <= 0) {
            mostraMessaggioErrore("Importo non valido");
            return;
        }

        if (importo <= saldo) {
            saldo -= importo;
            aggiornaEtichettaSaldo();
            JOptionPane.showMessageDialog(null, "Hai prelevato " + importo + "€");
        } else {
            mostraMessaggioErrore("Fondi insufficienti");
        }
        svuotaCampoImporto();
    }

    public static void deposita(double importo) {
        if (importo <= 0) {
            mostraMessaggioErrore("Importo non valido");
            return;
        }

        saldo += importo;
        aggiornaEtichettaSaldo();
        JOptionPane.showMessageDialog(null, "Hai depositato " + importo + "€");
        svuotaCampoImporto();
    }

    public static void mostraMessaggioErrore(String messaggio) {
        JOptionPane.showMessageDialog(null, messaggio, "Errore", JOptionPane.ERROR_MESSAGE);
    }

    public static void aggiornaEtichettaSaldo() {
        labelSaldo.setText(saldo + "€");
    }

    public static void svuotaCampoImporto() {
        campoImporto.setText("");
    }
}