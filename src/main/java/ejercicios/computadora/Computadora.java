package ejercicios.computadora;

public class Computadora {
    private iEstadoComputadora state;
    private int consumoEnRAM;
    private int consumoEnCPU;
    private Programa[] programas;

    public iEstadoComputadora getState() {
        return state;
    }

    public void setState(iEstadoComputadora state) {
        this.state = state;
    }

    public void request(){this.state.handler(this);}


    public int getConsumoEnRAM() {
        return consumoEnRAM;
    }

    public void setConsumoEnRAM(int consumoEnRAM) {
        this.consumoEnRAM = consumoEnRAM;
    }

    public int getConsumoEnCPU() {
        return consumoEnCPU;
    }

    public void setConsumoEnCPU(int consumoEnCPU) {
        this.consumoEnCPU = consumoEnCPU;
    }

    public Programa[] getProgramas() {
        return programas;
    }

    public void setProgramas(Programa[] programas) {
        this.programas = programas;
    }
}
