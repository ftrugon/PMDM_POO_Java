package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.print("Introduce un numero: ");
        float num = lectura.nextFloat();

        float area = (float) (Math.PI * Math.pow(num, 2));

        System.out.println("El area del circulo es de " + area);
    }
}
