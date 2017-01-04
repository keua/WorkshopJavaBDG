import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerConsola {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un String: ");
        String s = br.readLine();
        System.out.println("Ingresaste: "+ s);
        System.out.print("Ingrese un Entero: ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("Ingresaste: "+ i);
        System.out.print("Ingrese un Double: ");
        Double d = Double.parseDouble(br.readLine());
        System.out.println("Ingresaste: "+ d);
        System.out.print("Ingrese un Float: ");
        Float f = Float.parseFloat(br.readLine());
        System.out.println("Ingresaste: "+ f);
    }
}