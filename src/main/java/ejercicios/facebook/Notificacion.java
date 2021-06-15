package ejercicios.facebook;

public class Notificacion {
    private String descripcion;
    private String titulo;
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Notificacion(String descripcion, String titulo, String categoria) {
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void info(){
        System.out.println(descripcion);
        System.out.println("Titulo: "+descripcion);
        System.out.println("("+categoria+")");
    }


}
