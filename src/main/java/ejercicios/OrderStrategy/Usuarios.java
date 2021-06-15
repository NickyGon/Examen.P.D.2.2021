package ejercicios.OrderStrategy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuarios {
    private int ci;
    private String nombre;
    private Date fecha;
    private String profesion;

    public Usuarios(int ci, String nombre, Date fecha, String profesion) {
        this.ci = ci;
        this.nombre = nombre;
        this.fecha = fecha;
        this.profesion = profesion;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
    public void info(){
        System.out.println(nombre+"("+ci+")"+". Fecha de nacimiento: "+simpleDateFormat.format(fecha)+". Profesion: "+profesion);
    }



}
