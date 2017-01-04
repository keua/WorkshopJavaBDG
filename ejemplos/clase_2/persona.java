public class persona{
    public String nombre;
    public int edad;
    public void imprimirNombre(){
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public int adivinarNumero(){
        return (int)(Math.random()*100);
    }
}