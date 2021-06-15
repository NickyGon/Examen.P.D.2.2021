package ejercicios.ChatEducativo;

public class Docentes extends Colleague{

    private String nombre;
    private String ci;
    private String materia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Docentes(iCanalComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void enviar(String message) {
        canalComunicacion.enviar(message,this);
    }

    @Override
    public void recibirMensaje(String message) {
        System.out.println("Mensaje Recibido para El docente: "+nombre+"("+ci+")"+"de la materia "+materia);
        System.out.println(message);
    }
}
