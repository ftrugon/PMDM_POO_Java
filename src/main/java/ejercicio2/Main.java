package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.print("Introduce un numero: ");
        int num = lectura.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        }else System.out.println("El numero es impar");
    }
}
