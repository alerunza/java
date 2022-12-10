package novembre.es23_11_2022;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TriangoloRappr extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Disegna il triangolo utilizzando la classe Graphics
    g.drawLine(20, 20, 100, 20);
    g.drawLine(20, 20, 60, 100);
    g.drawLine(60, 100, 100, 20);
  }

  public static void main(String[] args) {
    JFrame finestra = new JFrame();
    finestra.setSize(400, 400);
    finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TriangoloGrafico triangolo = new TriangoloGrafico();
    finestra.add(triangolo);

    finestra.setVisible(true);
  }
}
