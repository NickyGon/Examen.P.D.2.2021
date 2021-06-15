package ejercicios.facebook;

import java.util.List;

public interface iUsuario {
    List<Cliente.Categorias> getTipoNotificacion();
    void subida(String message, Notificacion notificacion);
}
