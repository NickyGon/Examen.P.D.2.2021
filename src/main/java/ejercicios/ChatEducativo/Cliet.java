package ejercicios.ChatEducativo;

public class Cliet {
    public static void main(String[]args){
        ChatEducativo chatEducativo=new ChatEducativo();

        Estudiantes estudiantes=new Estudiantes(chatEducativo);
        estudiantes.setNombre("Nicole");
        estudiantes.setSemestre(4);
        estudiantes.setNumeroMatricula(51225);

        Docentes docentes=new Docentes(chatEducativo);
        docentes.setNombre("Nelly");
        docentes.setCi("1289763");
        docentes.setMateria("Algebra");

        Adminsitrativos adminsitrativos=new Adminsitrativos(chatEducativo);
        adminsitrativos.setNombre("Nelly");
        adminsitrativos.setCi("1233134");
        adminsitrativos.setCargo("Materias");

        chatEducativo.addAlChat(docentes);
        chatEducativo.addAlChat(estudiantes);
        chatEducativo.addAlChat(adminsitrativos);

        adminsitrativos.enviar("Hola","");
        docentes.enviar("Hola","");
        estudiantes.enviar("Nicole","d");
        estudiantes.enviar("Nicole","a");
        estudiantes.enviar("Nicole","");
    }
}
