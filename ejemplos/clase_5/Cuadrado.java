/**
 * Cuadrado exte
 */
public class Cuadrado implements Figura {

    Double dbX;
    Double dbY;

    public Cuadrado () {
        this.dbX = 0.0;
        this.dbY = 0.0;
    }

    public Cuadrado (Double dbX, Double dbY){
        this.dbX = dbX;
        this.dbY = dbY;
    }

    public Double calcularArea(){
        return this.dbX * this.dbY;
    }

    public Double calcularPerimetro(){
        return this.dbX * 4;
    }
}