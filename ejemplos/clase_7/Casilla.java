import javax.swing.JButton;

public class Casilla extends JButton {
    
    public int posX;
    public int posY;
    public String valor;

    public Casilla (int posX, int posY,String valor, GameStateHandler manejadorJuego){
        this.posX = posX;
        this.posY = posY;
        this.valor = valor;
        this.setText(this.valor);
        this.addActionListener(new EventHandler(this, manejadorJuego));
    }

}