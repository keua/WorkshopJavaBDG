import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * ReceptorDeClicks
 */
public class ReceptorDeClicks implements ActionListener {

    private JButton boton;

    public ReceptorDeClicks(JButton boton) {
        this.boton = boton;
    }

    public void actionPerformed(ActionEvent obj) {
        if (this.boton.getText().equals("-")) {
            if (Totito.ultimoMovimiento.equals("X")) {
                this.boton.setText("O");
                Totito.ultimoMovimiento = "O";
            } else {
                this.boton.setText("X");
                Totito.ultimoMovimiento = "X";
            }
        }
    }
}