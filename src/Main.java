import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Me tengo que acordar de STATIC, si lo quiero arriba
    // static String arrayPrimitiva[] = new String[6];
    public static void main(String[] args) {
        Random alea = new Random();
        Scanner leer = new Scanner(System.in);
        // PRIMITIVA
        String arrayPrimitiva[] = new String[6];
        for  (int i = 0; i < arrayPrimitiva.length; i++) {
            int numAle = alea.nextInt(100);
            // ¿Como puedo convertir un entero a cadena?
            // CONVERSOR DE TIPOS DE DATOS
            // de int a String
            arrayPrimitiva[i] = String.valueOf(numAle);
        }
        // imprimir el array
        for  (int i = 0; i < arrayPrimitiva.length; i++) {
            System.out.println(arrayPrimitiva[i]);
        }
        System.out.println("Dame un numero");
        String cadUsuario = leer.next();
        for  (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "XX";
            }
        }

        System.out.println("Dame un numero");
        String cadUsuario2 = leer.next();
        for  (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario2.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "XX";
            }
        }
        System.out.println("Dame un numero");
        String cadUsuario3 = leer.next();
        for  (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario3.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "XX";
            }
        }
        for  (int i = 0; i < arrayPrimitiva.length; i++) {
            System.out.println(arrayPrimitiva[i]);
        }
    }
    //FIN PRIMITIVA
}