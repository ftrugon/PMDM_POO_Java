package ejercicio14;

import java.util.ArrayList;

public class InventarioVideojuegos{
    private ArrayList<Videojuego> inventario;

    // Constructor
    public InventarioVideojuegos() {
        this.inventario = new ArrayList<>();
    }

    public void agregarVideojuego(Videojuego videojuego) {

        boolean existe = false;

        for (var i = 0; i <= inventario.size()-1;i++){
            if (inventario.get(i).getTitulo() == videojuego.getTitulo()){
                existe = true;
                break;
            }
        }

        if (existe){
            System.out.println("El juego que intentas insertar ya existe en el inventario");
        }else {
            inventario.add(videojuego);
        }
    }

    public void eliminarVideojuego(String titulo) {

        boolean existe = false;

        Videojuego juegoToDestroy = null;

        for (var i = 0; i <= inventario.size()-1;i++){
            if (inventario.get(i).getTitulo() == titulo){
                juegoToDestroy = inventario.get(i);
                existe = true;
                break;
            }
        }

        if (existe){
            inventario.remove(juegoToDestroy);
        }else System.out.println("El juego que has introducido no existe");
    }

    public void mostrarJuegos(){
        for (var i = 0; i <= inventario.size()-1;i++){
            inventario.get(i).mostrarInfo();
        }
    }

}
