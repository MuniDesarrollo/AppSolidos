package ClaseEncapsulamiente;

/**
 * Created by INFO_LAPTOP on 15/01/2018.
 */

public class Personal extends  Usuario {
    private int idTpersonal;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;

    public Personal()
    {
        super();
    }

    public  Personal(String _dni, String _nombre, String _apellido, String _telefono)
    {
        this.setDni(_dni);
        this.setNombre(_nombre);
        this.setApellido(_apellido);
        this.setTelefono(_telefono);
    }

    public int getIdTpersonal() {
        return idTpersonal;
    }

    public void setIdTpersonal(int idTpersonal) {
        this.idTpersonal = idTpersonal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
