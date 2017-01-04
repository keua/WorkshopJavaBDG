public class Persona{
    public String nombre;
    public int edad;
    public int numero;
    public int intentos;
    public void imprimirNombre(){
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public int adivinarNumero(){
        return (int)(Math.random()*100);
    }

    public String getNacionalidad(){
        return "sin nacionalidad";
    }

    public String saludo(){
        return "hola";
    }

    public String despedida(){
        return "adios";
    }
}