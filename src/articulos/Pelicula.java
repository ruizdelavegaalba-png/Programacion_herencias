package articulos;

public class Pelicula extends Articulo {
    //Atributos específicos de una película
    private String director;
    private int duracion; // duración total en minutos
    //Contructor completo
    public Pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String director, int duracion) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.duracion = duracion;
    }
    //Contructor vacío
    public Pelicula() {
    }
    //Getters y setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    //Muestra la duración en formato horas y minutos
    public void getDuracionHorasYMinutos(){
       int horas = this.duracion / 60;
       int minutos = this.duracion % 60;
        System.out.println( horas + " horas y  " + minutos + " minutos");
    }
    //Devuelve los segundos sobrantes
    public int getDuracionSegundos(){
        return this.duracion % 60;
    }
    //Representación en texto de la película
    @Override
    public String toString() {
        return "[Pelicula]" + this.getTitulo() + ", de " + this.director + "(" + this.getPrecioPorDia() + "€/día)";
    }
}
