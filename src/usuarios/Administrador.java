package usuarios;

import articulos.Articulo;

public class Administrador extends Usuario {
    //Tipos de rol disponible
    public enum rol {JEFE, VENDEDOR}
    private rol rol;
    //Contructor completo
    public Administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, rol rol) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.rol = rol;
    }
    //Contructor vacío
    public Administrador() {
    }
    //Getters y setters
    public rol getRol() {
        return rol;
    }

    public void setRol(rol rol) {
        this.rol = rol;
    }
    //Asignar un articulo a un cliente
    public void asignarArticulo(Cliente cliente, Articulo articulo){
        cliente.setArticulo( articulo);
    }
    //Retirar un articulo
    public void retirarArticulo(Cliente cliente){
        cliente.setArticulo(null);
    }
    //Representación en texto del Administrador
    @Override
    public String toString() {
        return "Administrador" + this.getNombreUsuario() + "(" + this.getId() + ")";
    }
}
