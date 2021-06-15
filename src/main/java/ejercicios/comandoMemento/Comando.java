package ejercicios.comandoMemento;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Comando {
    private Map<Integer,Memento> estados=new LinkedHashMap<>();
    private int where=0;


    public void addEstado(Memento documento){
        estados.put(where++,documento);
    }


    public Memento getEstado(String command){
        if (where==estados.size()){
            where--;
        }
        if (command.toUpperCase().equals("CTRL+Z") && (where<estados.size()&&where>-1)){
            System.out.println("+++Deshacer+++");
            return estados.get(--where);
        } else if (command.toUpperCase().equals("CTRL+Y") && (where<estados.size()&&where>-1)){
            System.out.println("+++Rehacer+++");
            return estados.get(++where);
        } else {
            return null;
        }
    }
}
