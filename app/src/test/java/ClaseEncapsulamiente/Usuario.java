package ClaseEncapsulamiente;

/**
 * Created by INFO_LAPTOP on 15/01/2018.
 */

public class Usuario {
    private int idUsuario;
    private String usuario;
    private String contraseña;

    public Usuario()
    {

    }

    public Usuario(String _usuario, String _contraseña)
    {
        this.setUsuario(_usuario);
        this.setContraseña(_contraseña);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
