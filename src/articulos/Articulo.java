package articulos;

public class Articulo {
    //Atributos del artículo
    private String titulo;
    private int anyoLanzamiento;
    private double precioPorDia;
    //Contructor con parámetros
    public Articulo(String titulo, int anyoLanzamiento, double precioPorDia) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = precioPorDia;
    }
    //Contructor vacío
    public Articulo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(int anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }
    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }
    //Calcular el precio total según cantidad y día
    public double calcularPrecio( int numArticulos, int dias){
        return (this.precioPorDia*numArticulos)*dias;
    }
    //Representación en texto del artículo
    @Override
    public String toString() {
        return "[Articulo]" + this.titulo + "(" + this.precioPorDia + "€/día)";
    }
}
