public class primos {
    public static void main(String[] args){
        int contador = 0;
        for(int i=1; i <=100; i++){
            contador = 0;
           for(int j=1; j<=100; j++){
               if(i%j == 0){
                   contador++;
                }
        }   
        if(contador<=2){
            System.out.println(i);
        }
    }
}
}