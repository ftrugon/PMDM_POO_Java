package ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.print("Introduce un numero, te digo si es primo: ");
        Integer num = lectura.nextInt();

        int posibleDivs = 0;

        for (var i = 1; i<= num;i++){
            if (num % i == 0) posibleDivs++;
        }

        if (posibleDivs == 2) {
            System.out.println("El numero es primo");
        } else if (num == 1) {
            System.out.println("El numero es primo");
        } else System.out.println("El numero no es primo");

    }
}
