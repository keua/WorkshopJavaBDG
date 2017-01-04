import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            //
            // ─── MENU DE CALCULADORA ─────────────────────────────────────────
            //
            System.out.println(" ------------------------- CALCULADORA -------------------------");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");
            System.out.println(" ------------------------- CALCULADORA -------------------------");
            System.out.print("Ingrese la operacion que desea realizar: ");
            int intOpcion = Integer.parseInt(br.readLine());
            // ─────────────────────────────────────────────────────────────────
            //
            // ─── OPCION ELEGIDA ───────────────────────────────
            //
            
            if (intOpcion == 1) {
                Double[] dbNumeros = getNumeros();
                mostrarResultado(sumar(dbNumeros[0], dbNumeros[1]));
            } else if (intOpcion == 2) {
                Double[] dbNumeros = getNumeros();
                mostrarResultado(restar(dbNumeros[0], dbNumeros[1]));
            } else if (intOpcion == 3) {
                Double[] dbNumeros = getNumeros();
                mostrarResultado(multiplicar(dbNumeros[0], dbNumeros[1]));
            } else if (intOpcion == 4) {
                Double[] dbNumeros = getNumeros();
                mostrarResultado(dividir(dbNumeros[0], dbNumeros[1]));
            } else if (intOpcion == 5) {
                return;
            }
            // ─────────────────────────────────────────────────────────────────

        }
    }

    private static void esperarResultado() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Pulse ENTER para continuar");
        br.readLine();
    }
    private static void mostrarResultado(Double dbResultado){
        System.out.println("El resultado de la operacion es: "+ dbResultado);
        try {
            esperarResultado();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    private static Double[] getNumeros() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un numero decimal: ");
        Double dbNum1 = Double.parseDouble(br.readLine());
        System.out.print("Ingrese otro numero decimal: ");
        Double dbNum2 = Double.parseDouble(br.readLine());
        Double[] arrNums = {dbNum1,dbNum2};
        return arrNums;
    }

    private static Double sumar(Double dbNum1, Double dbNum2) {
        return dbNum1 + dbNum2;
    }

    private static Double restar(Double dbNum1, Double dbNum2) {
        return dbNum1 - dbNum2;
    }

    private static Double multiplicar(Double dbNum1, Double dbNum2) {
        return dbNum1 * dbNum2;
    }

    private static Double dividir(Double dbNum1, Double dbNum2) {
        return (dbNum1 / dbNum2);
    }
}