package ejercicios.facebook;

public interface iPagina {
    void attach(iUsuario observer);
    void detach(iUsuario observer);
    void subirContenido(Notificacion notificacion);
}
