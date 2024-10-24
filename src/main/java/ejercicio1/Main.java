package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = lectura.next();
        System.out.println("Hola " + nombre + ", odio java");
    }
}
