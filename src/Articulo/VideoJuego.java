package Articulo;

public class VideoJuego extends Articulo {
    // Atributos específicos de un videojuego
    private String director;
    private String plataforma;
    private int pegi;
    //Contructor completo
    public VideoJuego(String titulo, int anyoLanzamiento, double precioPorDia, String director, String plataforma, int pegi) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.plataforma = plataforma;
        this.pegi = pegi;
    }
    //Contructor vacío
    public VideoJuego() {
    }
    //Getters y setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }
    //Indica si el videojuego es solo apto para adultos
    public boolean paraAdultos(){
        return this.pegi >= 18;
    }
    //Comprueba si una persona de cierta edad puede jugarlo
    public boolean esApto( int edad){
        return edad >= this.pegi;
    }
    //Representación en texto del videojuego

    @Override
    public String toString() {
        return "[VideoJuego]" + this.getTitulo() + ",de " + this.director + "(" + this.getPrecioPorDia() + "€/día)";
    }
}
