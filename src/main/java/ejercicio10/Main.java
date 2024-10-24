package ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        int eleccion = impMenu(lectura);
        System.out.println("Ahora dime el numero que quieres transformar: ");
        Float num = lectura.nextFloat();

        if (eleccion == 1) {
            System.out.println( num * 9/5 + 32);
        }else if (eleccion == 2){
            System.out.println((num - 32) * 5/9);
        }else System.out.println("Numero introducido no valido");

    }

    public static int impMenu(Scanner scanner){
        System.out.println("Que combersion quieres hacer?: ");
        System.out.println("1. Celsius a Fahrenheit ");
        System.out.println("2. Fahrenheit a Celsius ");
        return scanner.nextInt();
    }
}
