package ejercicios.ChatEducativo;


public abstract class Colleague {
    protected iCanalComunicacion canalComunicacion;

    public Colleague(iCanalComunicacion canalComunicacion){
        this.canalComunicacion=canalComunicacion;
    }

    public abstract void enviar(String message);
    public abstract void recibirMensaje(String message);
}
