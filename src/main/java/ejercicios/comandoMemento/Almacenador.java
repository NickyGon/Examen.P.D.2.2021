package ejercicios.comandoMemento;

public class Almacenador {
    private Documento documento;
    public Almacenador(){}

    public void almacenarEstado(Documento state) {
        System.out.println("**** Almacenando Estado *****");
        state.info();
        this.documento = state;
    }

    public Memento createEstado(){
        System.out.println("**** Creando Estado *****");
        System.out.println();
        return new Memento(this.documento) ;
    }

    public void restaurarEstado(Memento memento){
        this.documento=memento.getState();
        this.documento.info();
        System.out.println();
    }

}
