package ejercicio14;

public class Videojuego {
    private String titulo;
    private String plataforma;
    private int horasJugadas;

    public Videojuego(String titulo, String plataforma, int horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Plataforma: " + plataforma + ", Horas jugadas: " + horasJugadas);
    }

    public String getTitulo(){
        return titulo;
    }
}

