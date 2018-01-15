package ClaseEncapsulamiente;

/**
 * Created by INFO_LAPTOP on 15/01/2018.
 */

public class Ciudadano {
    private  int idTciudadano;
    private String nombre;
    private String apellido;
    private String dni;

    public Ciudadano()
    {

    }

    public  Ciudadano(String _nombre, String _apellido, String _dni)
    {
        this.setNombre(_nombre);
        this.setApellido(_apellido);
        this.setDni(_dni);
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
}
