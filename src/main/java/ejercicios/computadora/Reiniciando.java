package ejercicios.computadora;

public class Reiniciando implements iEstadoComputadora{
    private int enabledPrograms=0;
    @Override
    public void handler(Computadora computadora) {
        System.out.println("REINICIANDO");
        computadora.setConsumoEnRAM(0);
        computadora.setConsumoEnCPU(0);
        System.out.println("Programas abiertos: "+enabledPrograms);
        System.out.println("Consumo en RAM: "+computadora.getConsumoEnRAM()+"%");
        System.out.println("Consumo en CPU: "+computadora.getConsumoEnCPU()+"%");
        System.out.println("********************");
    }
}
