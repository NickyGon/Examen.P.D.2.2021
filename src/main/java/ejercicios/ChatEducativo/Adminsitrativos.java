package ejercicios.ChatEducativo;

public class Adminsitrativos extends Colleague{

    private String nombre;
    private String cargo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Adminsitrativos(iCanalComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void enviar(String message) {
        canalComunicacion.enviar(message,this);
    }

    @Override
    public void recibirMensaje(String message) {
        System.out.println("Mensaje Recibido para el administrativo: "+nombre+" con cargo de "+cargo);
        System.out.println(message);
    }
}
