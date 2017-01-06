/**
 * GameStateHandler
 */
public class GameStateHandler {

    public Casilla casilla;
    public Tablero tablero;
    public static String ultimoMovimiento = "";

    public GameStateHandler(Casilla casilla){
        this.casilla = casilla;
    }

    public GameStateHandler(){
        
    }

    public String movmentHandler() {
        if (this.casilla.getText().equals("-")) {
            if (GameStateHandler.ultimoMovimiento.equals("X")) {
                this.casilla.setText("O");
                GameStateHandler.ultimoMovimiento = "O";
                System.out.println("Turno de X");
                return "Turno de X";
            } else {
                this.casilla.setText("X");
                GameStateHandler.ultimoMovimiento = "X";
                System.out.println("Turno de O");
                return "Turno de O";
            }

        }

        return "";
    }
}