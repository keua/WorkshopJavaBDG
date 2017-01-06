import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Container;

public class Tablero extends JFrame {
    
    Casilla[] casillas;
    public  GameStateHandler manejadorJuego;

    public Tablero() {

        manejadorJuego = new GameStateHandler();
        manejadorJuego.tablero = this;

        this.casillas = new Casilla[9];
        for (int i = 0; i < this.casillas.length; i++) {
            this.casillas[i] =  new Casilla(this.encontrarPosX(i),this.encontrarPosY(i),"-", manejadorJuego);
        }
        
        System.out.println(this);

        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        JPanel fila1 = new JPanel();
        JPanel fila2 = new JPanel();
        JPanel fila3 = new JPanel();

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        fila1.setLayout(new BoxLayout(fila1, BoxLayout.X_AXIS));
        fila2.setLayout(new BoxLayout(fila2, BoxLayout.X_AXIS));
        fila3.setLayout(new BoxLayout(fila3, BoxLayout.X_AXIS));

        fila1.add(casillas[0]);
        fila1.add(casillas[1]);
        fila1.add(casillas[2]);

        fila2.add(casillas[3]);
        fila2.add(casillas[4]);
        fila2.add(casillas[5]);

        fila3.add(casillas[6]);
        fila3.add(casillas[7]);
        fila3.add(casillas[8]);

        c.add(fila1);
        c.add(fila2);
        c.add(fila3);

        this.setVisible(true);
    }

    private int encontrarPosX(int index) {
        if (index < 3) {
            return 1;
        } else if (index < 6) {
            return 2;
        } else {
            return 3;
        }
    }

    private int encontrarPosY(int index) {
        if (index == 0 || index == 3 || index == 6) {
            return 1;
        } else if (index == 1 || index == 4 || index == 7) {
            return 2;
        } else {
            return 3;
        }
    }
}