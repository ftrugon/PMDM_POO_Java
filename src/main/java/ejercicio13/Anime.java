package ejercicio13;

public class Anime {
    private String nombre;
    private int episodios;
    private String genero;

    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }



    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Episodios: " + episodios + ", Género: " + genero);
    }
}
