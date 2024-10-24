package ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.print("Introduce un numero: ");
        int eleccion = lectura.nextInt();

        for (var i = 0; i <= 10 ; i++){
            System.out.println(eleccion + "*" + i + "=" + i*eleccion);
        }
    }
}
