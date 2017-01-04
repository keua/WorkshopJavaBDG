/**
 * Circulo
 */
public class Circulo implements Figura {

    private static final Double PI = 3.1416;
    Double dbRadio;

    public Circulo () {
        this.dbRadio = 0.0;
    }

    public Circulo (Double dbRadio){
        this.dbRadio = dbRadio;
    }

    public Double calcularArea(){
        return (PI * (this.dbRadio * this.dbRadio));
    }

    public Double calcularPerimetro(){
        return (PI * 2.0 * this.dbRadio);
    }
}