package ejercicio14;

import java.util.Scanner;

public class    Main {
    public static void main(String[] args) {

        InventarioVideojuegos inventario = new InventarioVideojuegos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu de Inventario de Videojuegos ---");
            System.out.println("1. Añadir videojuego");
            System.out.println("2. Eliminar videojuego");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Dime el titulo del videojuego: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Dime la plataforma del videojuego: ");
                    String plataforma = scanner.nextLine();
                    System.out.print("Dime las horas jugadas del videojuego: ");
                    int horasJugadas = scanner.nextInt();
                    scanner.nextLine();

                    Videojuego videojuego = new Videojuego(titulo, plataforma, horasJugadas);
                    inventario.agregarVideojuego(videojuego);
                    break;

                case 2:
                    System.out.print("Dime el título del videojuego a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    inventario.eliminarVideojuego(tituloEliminar);
                    break;

                case 3:
                    inventario.mostrarJuegos();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }


}

