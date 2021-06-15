package ejercicios.ChatEducativo;

public class Estudiantes extends Colleague{

    private String nombre;
    private int numeroMatricula;
    private int semestre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Estudiantes(iCanalComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void enviar(String message,String forWho) {
        canalComunicacion.enviar(message,this,forWho);
    }

    @Override
    public void recibirMensaje(String message) {
        System.out.println("Mensaje Recibido para el estudiante: "+nombre+"("+ numeroMatricula +")"+"en el semestre "+semestre);
        System.out.println(message);
    }
}
