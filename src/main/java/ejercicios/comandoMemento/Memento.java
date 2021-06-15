package ejercicios.comandoMemento;

import memento.basic.ConcreteObject;

public class Memento {
    private Documento state;

    public Memento(Documento guardado){
        this.state=guardado;
    }

    public Documento getState() {
        return state;
    }
}
