package Articulo;

public class Libro extends Articulo {
    //Atributos específico de un libto
    private String autor;
    private int numPaginas;
    //Enumeración de género
    public enum Genero { MISTERIO, TERROR, ACCION, HISTORIA, FANTASIA}
    private Genero genero;
    //Constructor completo
    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numPaginas, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }
    //Constructor vacío
    public Libro() {
    }
    //Getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    //Indica si el libro tiene más de 200 páginas
    public boolean esLargo(){
        return this.numPaginas > 200;
    }
    //Representación en texto del libro
    @Override
    public String toString() {
        return "[Libro]" + this.getTitulo() + ", de" + this.autor + "(" + this.getPrecioPorDia() + " €/)";
    }
}
