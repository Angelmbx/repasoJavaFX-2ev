package modelo;

public class Ciudad {

private String nombre;
private String url;
// secuenciaImagenesInfantil.addImage(getClass().getResource("images/infantil/01.jpg").toExternalForm());



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return  nombre;
    }
}
