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
        if (boton.getText().equals("X")) {
            this.boton.setText("O");
        } else if (boton.getText().equals("O")) {
            this.boton.setText("X");
        } else {
            this.boton.setText("O");
        }
    }
}