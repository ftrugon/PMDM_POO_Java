package ejercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.print("Dime el nombre del anime: ");
        String nombre = lectura.nextLine();

        System.out.print("Dime los capitulos del anime: ");
        int episosdios = lectura.nextInt();

        lectura.nextLine();

        System.out.print("Dime el genero del anime: ");
        String genero = lectura.nextLine();

        Anime animeCreated = new Anime(nombre,episosdios,genero);
        animeCreated.mostrarInfo();

    }
}

