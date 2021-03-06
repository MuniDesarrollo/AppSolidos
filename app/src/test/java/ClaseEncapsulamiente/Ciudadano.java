package ClaseEncapsulamiente;

/**
 * Created by INFO_LAPTOP on 15/01/2018.
 */

public class Ciudadano extends Usuario {
    private  int idTciudadano;
    private String nombre;
    private String apellido;
    private String dni;
    private  String telefono;

    public Ciudadano()
    {
        super();
    }

    public  Ciudadano(String _nombre, String _apellido, String _dni , String _telefono)
    {
        this.setNombre(_nombre);
        this.setApellido(_apellido);
        this.setDni(_dni);
        this.setTelefono(_telefono);
    }

    public int getIdTciudadano() {
        return idTciudadano;
    }

    public void setIdTciudadano(int idTciudadano) {
        this.idTciudadano = idTciudadano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
