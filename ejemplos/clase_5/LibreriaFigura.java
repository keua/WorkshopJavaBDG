public class LibreriaFigura{
    public static double sumarAreas(Figura figura1, Figura figura2){
        return figura1.calcularArea() + figura2.calcularArea();
    }
    public static double restarAreas(Figura figura1, Figura figura2){
        return figura1.calcularArea() - figura2.calcularArea();
    }
}