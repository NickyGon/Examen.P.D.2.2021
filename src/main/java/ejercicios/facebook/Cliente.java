package ejercicios.facebook;

import java.util.List;

public class Cliente implements iUsuario{

    private String nombre;
    private String ci;

    public Cliente(String nombre, String ci, List<Categorias> categoria) {
        this.nombre = nombre;
        this.ci = ci;
        this.categoria = categoria;
    }

    public enum Categorias{
        VIDEO,IMAGENES,POST;
    }

    private List<Categorias> categoria;

    @Override
    public List<Categorias> getTipoNotificacion() {
        return this.categoria;
    }

    @Override
    public void subida(String message, Notificacion notificacion) {
        System.out.println("NUEVA SUBIDA DE "+notificacion.getCategoria());
        System.out.println(message);
        System.out.println("(Para "+nombre+": "+ci+")");
    }
}
