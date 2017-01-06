/**
 * Totito
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Container;

public class Totito {

    public static String ultimoMovimiento = "";
    public static JButton[] tablero = new JButton[9];

    public Totito () {
        
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(400,400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        for(int i=0;i<9;i++){
            tablero[i] = new JButton("-");
            tablero[i].addActionListener(new ReceptorDeClicks(tablero[i]));
        }

        Container c = ventana.getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        JPanel jp1 = new JPanel();
        jp1.setLayout(new BoxLayout(jp1, BoxLayout.X_AXIS));
        jp1.add(tablero[0]);
        jp1.add(tablero[3]);
        jp1.add(tablero[6]);
        JPanel jp2 = new JPanel();
        jp2.setLayout(new BoxLayout(jp2, BoxLayout.X_AXIS));
        jp2.add(tablero[1]);
        jp2.add(tablero[4]);
        jp2.add(tablero[7]);
        JPanel jp3 = new JPanel();
        jp3.setLayout(new BoxLayout(jp3, BoxLayout.X_AXIS));
        jp3.add(tablero[2]);
        jp3.add(tablero[5]);
        jp3.add(tablero[8]);
        c.add(jp1);
        c.add(jp2);
        c.add(jp3);
        ventana.setVisible(true);

    }
}