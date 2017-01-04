public class PersonaImpar extends Persona{
    public int adivinarNumero(){
        int numero = (int)(Math.random()*100);
        if (numero%2 != 0) {
            return numero;
        }else{
            return numero + 1;
        }
    }
}