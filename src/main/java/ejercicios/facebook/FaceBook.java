package ejercicios.facebook;

import java.util.ArrayList;
import java.util.List;

public class FaceBook implements iPagina{
    private List<iUsuario> usuarios=new ArrayList<>();


    @Override
    public void attach(iUsuario observer) {
        usuarios.add(observer);
    }

    @Override
    public void detach(iUsuario observer) {
        usuarios.remove(observer);
    }

    @Override
    public void subirContenido(Notificacion notificacion) {
        for (iUsuario usuario: usuarios){
            for (Cliente.Categorias categorias: usuario.getTipoNotificacion()){
                if (notificacion.getCategoria().toUpperCase().equals(categorias.name())){
                    usuario.subida("Se subio un nuevo post de Laura, nuevo "+notificacion.getCategoria(),notificacion);
                }
            }
        }
    }
}
