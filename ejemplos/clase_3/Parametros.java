public class Parametros {

    private static final int NUMERO = 79;

    public static void main(String[] args){

         Persona jugador = new Persona();
         int rondas = 0;
         int mitad = (args.length / 2);
         Persona[] asientos = new Persona[args.length];

         for(int i=0; i < args.length; i++){
             if (i<mitad) {
                 asientos[i] =  new PersonaPar();
             } else {
                 asientos[i] =  new PersonaImpar();
             }
             asientos[i].nombre = args[i];
         }

        do {
            rondas ++;
            for(int j=0; j < asientos.length; j++){
                jugador = asientos[j];
                jugador.numero = jugador.adivinarNumero();
                jugador.intentos++;
                System.out.println("el numero del jugado: "+jugador.nombre+" es: "+jugador.numero);
                if(jugador.numero == NUMERO){
                    break;
                }
            }
        } while (jugador.numero != NUMERO);

        System.out.println("El jugador que es "+jugador.nombre+" y el numero es "+jugador.numero+" en "+rondas+" rondas en "+jugador.intentos+" intentos");
    }
}