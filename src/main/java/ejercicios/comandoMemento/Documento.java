package ejercicios.comandoMemento;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Documento {
    private String titulo;
    private Date fechaCreacion;
    private String cuerpo;

    public Documento(String titulo, Date fechaCreacion, String cuerpo) {
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.cuerpo = cuerpo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    SimpleDateFormat simple=new SimpleDateFormat("dd-MM-yyyy");
    public void info(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Creado el "+simple.format(fechaCreacion));
        System.out.println(cuerpo);
    }
}
