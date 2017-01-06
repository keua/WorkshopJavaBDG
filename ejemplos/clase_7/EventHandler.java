import java.awt.event.ActionListener;

import javax.swing.JButton;


import java.awt.event.ActionEvent;

/**
 * EventHandler 
 */
public class EventHandler implements ActionListener {

    private GameStateHandler manejadorJuego;
    public EventHandler  (Casilla casilla, GameStateHandler manejadorJuego) {
        this.manejadorJuego = manejadorJuego;
        this.manejadorJuego.casilla = casilla;             
    }

    public void actionPerformed(ActionEvent obj) {
       this.manejadorJuego.movmentHandler();
    }

}