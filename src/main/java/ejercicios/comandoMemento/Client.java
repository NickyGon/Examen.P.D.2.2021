package ejercicios.comandoMemento;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Client {
    public static void main (String [] args) {
        Comando comando= new Comando();
        Almacenador almacenador= new Almacenador();

        Documento documento;

        Calendar calendar=new GregorianCalendar(2021,Calendar.APRIL,2);
        documento=new Documento("EL pato",calendar.getTime(),"Señor pato");
        almacenador.almacenarEstado(documento);
        comando.addEstado(almacenador.createEstado());

        documento=new Documento("El pato",calendar.getTime(),"Señor pato, lo quiero mucho");
        almacenador.almacenarEstado(documento);
        comando.addEstado(almacenador.createEstado());

        documento=new Documento("EL pato",calendar.getTime(),"Señor pato, lo quiero buscar");
        almacenador.almacenarEstado(documento);
        comando.addEstado(almacenador.createEstado());

        documento=new Documento("EL pato",calendar.getTime(),"Señor pato, lo quiero buscar para la cena");
        almacenador.almacenarEstado(documento);
        comando.addEstado(almacenador.createEstado());

        almacenador.restaurarEstado(comando.getEstado("ctrl+z"));
        almacenador.restaurarEstado(comando.getEstado("ctrl+z"));
        almacenador.restaurarEstado(comando.getEstado("ctrl+z"));
        almacenador.restaurarEstado(comando.getEstado("ctrl+y"));
        almacenador.restaurarEstado(comando.getEstado("ctrl+y"));
        almacenador.restaurarEstado(comando.getEstado("ctrl+y"));

    }
}
