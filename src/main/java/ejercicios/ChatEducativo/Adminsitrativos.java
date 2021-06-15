package ejercicios.ChatEducativo;

public class Adminsitrativos extends Colleague{

    private String nombre;
    private String cargo;
    private String ci;


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

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Adminsitrativos(iCanalComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void enviar(String message,String forWho) {
        canalComunicacion.enviar(message,this,forWho);
    }

    @Override
    public void recibirMensaje(String message) {
        System.out.println("Mensaje Recibido para el administrativo: "+nombre+"("+ci+")"+" con cargo de "+cargo);
        System.out.println(message);
    }
}
