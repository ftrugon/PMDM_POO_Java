package ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.print("Introduce un numero, te lo doy al reves: ");
        String palabra = lectura.nextLine();

        char character;
        String reversedWord = "";

        for (var i = 0; i <= palabra.length()-1; i++){
            character = palabra.charAt(i);
            reversedWord = character + reversedWord;
        }

        System.out.println(reversedWord);
    }
}
