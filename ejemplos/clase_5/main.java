public class main {
    public static void main (String[] args){
        Cuadrado fCuadrado = new Cuadrado(4.0,4.0);
        Circulo fCirculo =  new Circulo(3.0);
        System.out.println("El valor del area sombreada es: " + LibreriaFigura.restarAreas(fCirculo, fCuadrado));
        Double dbAreaSombreada = LibreriaFigura.restarAreas(new Circulo(2.0),new Circulo(1.0));
        System.out.println("El valor del area sombreada es: " + dbAreaSombreada);
    }
}