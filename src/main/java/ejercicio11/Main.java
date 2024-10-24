package ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Cuantos numeros quieres que tenga la funcion de fibonacci: ");
        int limit = lectura.nextInt();

        int num = 1;
        int numAnterior = 0;
        String cadena = "";

        for (var i = 0; i<= limit; i++){

            cadena += numAnterior + " + ";


            int temp = num;
            num = numAnterior + num;
            numAnterior = temp;

        }

        if (cadena.endsWith(" + ")) {
            cadena = cadena.substring(0, cadena.length() - 3);
        }

        System.out.println(cadena);
    }
}
