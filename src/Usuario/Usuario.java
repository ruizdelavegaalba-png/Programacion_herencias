package Usuario;

public class Usuario {
    //Datos básicos del usuario
    private String nombreUsuario;
    private String contrasenya;
    private int id;
    private int anyoNacimiento;
    //Contructor completo
    public Usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }
    //Contructor vacío
    public Usuario() {
    }
    //Getters y setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }
    //Devuelve true si el usuario tiene más de 18 años
    public boolean esAdulto() {
        return 2025 - this.anyoNacimiento > 18;
    }
    //Comprueba si la contraseña tiene la longitud segura
    public boolean contrasenyaSegura() {
        return this.contrasenya.length() > 10;
    }
    //Representación en texto del usuario
    @Override
    public String toString() {
        return this.nombreUsuario + "(" + this.id + ")";
    }
}