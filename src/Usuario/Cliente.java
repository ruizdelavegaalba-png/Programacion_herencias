package Usuario;

import Articulo.Articulo;

public class Cliente extends Usuario {
    //Artículo que el cliente alquila
    private Articulo articulo;
    //Númmero de socios vinculados al cliente
    private int numSocios;
    //Contructor completo
    public Cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Articulo articulo, int numSocios) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.articulo = articulo;
        this.numSocios = numSocios;
    }
    //Contructor vacío
    public Cliente() {
    }
    //Getters y setters
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getNumSocios() {
        return numSocios;
    }

    public void setNumSocios(int numSocios) {
        this.numSocios = numSocios;
    }
    //Calcula el precio utilizando el artículo asociado
    public double calcularPrecio( int numArticulos, int dias){
        return this.getArticulo().calcularPrecio(numArticulos, dias);
    }
    //Representación en texto del cliente
    @Override
    public String toString() {
        return "Cliente" + this.getNombreUsuario() + "(" + this.getId() + ")";
    }
}
