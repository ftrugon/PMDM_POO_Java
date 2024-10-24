package ejercicio4;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner lectura = new Scanner (System.in);

        int randomNumber = random.nextInt(0,100);

        System.out.print("Introduce un numero: ");
        int eleccion = lectura.nextInt();

        do{

            if (eleccion > randomNumber){
                System.out.println("El numero introducido es mayor al aleatorio");
            }else if (eleccion < randomNumber) System.out.println("El numero introducido es menor al aleatorio");

            eleccion = lectura.nextInt();

        }while (randomNumber != eleccion);

    }
}
