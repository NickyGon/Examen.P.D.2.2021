package ejercicios.facebook;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[]args) {
        FaceBook faceBook= new FaceBook();
        List<Cliente.Categorias> lista=new ArrayList<>();
        lista.add(Cliente.Categorias.IMAGENES);

        List<Cliente.Categorias> lista2=new ArrayList<>();
        lista2.add(Cliente.Categorias.IMAGENES);
        lista2.add(Cliente.Categorias.VIDEO);

        Cliente cliente1=new Cliente("Nicole","11298329",lista);
        Cliente cliente2=new Cliente("Nicole2","11398329",lista2);


        faceBook.attach(cliente1);
        faceBook.attach(cliente2);

        faceBook.subirContenido(new Notificacion("Miren este perrito","El perro salta","imagenes"));
        faceBook.subirContenido(new Notificacion("Miren este video","El perro salta hacia la piscina","video"));
    }
}
