public class ordenar{
    public static void main (String[] args){
        int tamanio = args.length;
        int aux = 0;
        for(int i=0; i <= tamanio-1; i++){
            for(int j=0; j <= tamanio-1; j++){
                if(Integer.parseInt(args[i]) < Integer.parseInt(args[j])){
                    aux = Integer.parseInt(args[i]);
                    args[i] = args[j];
                    args[j] = ""+aux;
                }
            }
        }

        for(int i=0; i<= tamanio-1; i++){
            System.out.println(args[i]);
        }
    }
}