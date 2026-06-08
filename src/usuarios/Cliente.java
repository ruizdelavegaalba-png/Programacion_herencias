package usuarios;

import articulos.Articulo;

public class Cliente extends Usuario {
    
    private Articulo articulo;
    private int numSocios;
    
    public Cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Articulo articulo, int numSocios) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.articulo = articulo;
        this.numSocios = numSocios;
    }
    
    public Cliente() {
    }
    
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
   
    public double calcularPrecio( int numArticulos, int dias){
        return this.getArticulo().calcularPrecio(numArticulos, dias);
    }
    
    @Override
    public String toString() {
        return "Cliente" + this.getNombreUsuario() + "(" + this.getId() + ")";
    }
}
