package articulos;

public class AlbumMusica extends Articulo {
    //Atributos específicos de un álbum musical
    private String autor;
    private int numCanciones;
    private boolean single;
    //Contructor completo
    public AlbumMusica(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numCanciones, boolean single) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }
    //Contructor vacío
    public AlbumMusica() {
    }
    //Getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
    //Calcula la duración total del albúm según la duración media de cada canción
    public double getDuracionTotal( double duracion){
        return this.numCanciones * duracion;
    }
    //Representación en texto del albúm
    @Override
    public String toString() {
        return "[Album]" + this.getTitulo() + ", de " + this.autor + "(" + this.getPrecioPorDia() + "€/día)";
    }
}
