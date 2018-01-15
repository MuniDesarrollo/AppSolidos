package ClaseEncapsulamiente;

import java.util.Date;

/**
 * Created by INFO_LAPTOP on 15/01/2018.
 */

public class Detallereporte {

    private Date fecha;
    private String ubicacion;
    private String foto;

    public Detallereporte(Date _fecha, String _ubicacio, String _foto)
    {
        this.setFecha(_fecha);
        this.setUbicacion(_ubicacio);
        this.setFoto(_foto);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
