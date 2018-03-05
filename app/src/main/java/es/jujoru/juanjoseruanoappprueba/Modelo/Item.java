package es.jujoru.juanjoseruanoappprueba.Modelo;

/**
 * Created by Nino Ruano on 05/03/2018.
 */

public class Item {
    int earth_date;
    String camera_full_name;
    String url_imagen;

    public Item(int earth_date, String camera_full_name, String url_imagen) {
        this.earth_date = earth_date;
        this.camera_full_name = camera_full_name;
        this.url_imagen = url_imagen;
    }

    public Item() {
    }

    public int getEarth_date() {
        return earth_date;
    }

    public void setEarth_date(int earth_date) {
        this.earth_date = earth_date;
    }

    public String getCamera_full_name() {
        return camera_full_name;
    }

    public void setCamera_full_name(String camera_full_name) {
        this.camera_full_name = camera_full_name;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }
}
