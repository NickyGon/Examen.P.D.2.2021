package ejercicios.ChatEducativo;

import java.util.HashMap;
import java.util.Map;

public class ChatEducativo implements iCanalComunicacion{
    private Estudiantes estudiante;
    private Docentes docente;
    private Adminsitrativos adminsitrativo;

    private Map<String,Colleague> mapChat=new HashMap<>();


    public void addAlChat(Colleague colleague){
        if (colleague instanceof Estudiantes){
            this.estudiante=(Estudiantes)colleague;
            mapChat.put(String.valueOf(this.estudiante.getNumeroMatricula()),this.estudiante);
        }
        if (colleague instanceof Docentes) {
            this.docente = (Docentes) colleague;
            mapChat.put(this.docente.getCi(), this.docente);
        }
        if (colleague instanceof Adminsitrativos){
            this.adminsitrativo=(Adminsitrativos)colleague;
            mapChat.put(this.adminsitrativo.getCi(),this.adminsitrativo);
        }
    }
    @Override
    public void enviar(String message, Colleague origen,String forWho) {
        for (Map.Entry<String,Colleague> entry: mapChat.entrySet()){
            if (origen instanceof Adminsitrativos){
                Adminsitrativos parseAd=(Adminsitrativos) origen;
                if (parseAd.getCi()!=entry.getKey()){
                    entry.getValue().recibirMensaje(message);
                }
            } else if (origen instanceof Docentes){
                Docentes parseDoc=(Docentes)origen;
                if (parseDoc.getCi()!=entry.getKey()&& (entry.getValue() instanceof Estudiantes || entry.getValue() instanceof Docentes )){
                    entry.getValue().recibirMensaje(message);
                }
            } else if (origen instanceof Estudiantes){
                Estudiantes parseEst=(Estudiantes) origen;
                if(String.valueOf(parseEst.getNumeroMatricula())!=entry.getKey() && forWho.toUpperCase().equals("A")){
                        entry.getValue().recibirMensaje(message);
                    } else if (forWho.toUpperCase().equals("D") && entry.getValue() instanceof Docentes && String.valueOf(parseEst.getNumeroMatricula())!=entry.getKey()){
                        entry.getValue().recibirMensaje(message);
                    } else if (forWho.toUpperCase().equals("A") && entry.getValue() instanceof Adminsitrativos && String.valueOf(parseEst.getNumeroMatricula())!=entry.getKey()){
                        entry.getValue().recibirMensaje(message);
                    }
                }
            }
        System.out.println("---Fin de envio---");
        }

    }

