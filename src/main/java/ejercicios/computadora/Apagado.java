package ejercicios.computadora;

import java.util.Random;

public class Apagado implements iEstadoComputadora{
    private int enabledPrograms=0;

    @Override
    public void handler(Computadora computadora) {
        System.out.println("APAGANDO");
        computadora.setConsumoEnRAM(new Random().nextInt(20));
        computadora.setConsumoEnCPU(new Random().nextInt(20));
        System.out.println("Programas abiertos: "+enabledPrograms);
        System.out.println("Consumo en RAM: "+computadora.getConsumoEnRAM()+"%");
        System.out.println("Consumo en CPU: "+computadora.getConsumoEnCPU()+"%");
        System.out.println("********************");
    }
}
