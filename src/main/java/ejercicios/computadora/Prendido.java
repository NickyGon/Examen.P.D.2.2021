package ejercicios.computadora;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Prendido implements iEstadoComputadora{
    private int enabledPrograms=0;
    private int bound=0;
    private Map<String,Programa> enabledProgMap=new LinkedHashMap<>();
    @Override
    public void handler(Computadora computadora) {
        System.out.println("ENCENDIENDO");

        System.out.println("Programas instalados: "+computadora.getProgramas().length);

        //Selecciona un numero random de programas a abrirse según el largo del array
        enabledPrograms=new Random().nextInt(computadora.getProgramas().length);
        System.out.println("Maximo de programas planeado: "+enabledPrograms);

        //Establece el máximo de programas abiertos en caso de existir posibles excedidos a 100%, mediante ajuste del
        //máximo de programas a abrirse
        while (computadora.getConsumoEnRAM()+(5*enabledPrograms)>100 || computadora.getConsumoEnCPU()+(5*enabledPrograms)>100){
            enabledPrograms--;
        }

        //Seleccionará un programa random del array y lo pondrá en un mapa, n veces (n= numero mamixmo
        //de programas abiertos). El Mapa demostrará la randomización de programas a seleccionar
        for (int i=0;i<enabledPrograms;i++){
            int casilla=0+(int)(Math.random()*(((computadora.getProgramas().length-1)-0)+1));
            boolean go=false;
            while (!go){
                if (!enabledProgMap.containsKey(computadora.getProgramas()[casilla].getNombre())){
                    enabledProgMap.put(computadora.getProgramas()[casilla].getNombre(),computadora.getProgramas()[casilla]);
                    go=true;
                }
                casilla=0+(int)(Math.random()*(((computadora.getProgramas().length-1)-0)+1));
            }
        }

        computadora.setConsumoEnCPU(computadora.getConsumoEnCPU()+(5*enabledPrograms));
        computadora.setConsumoEnRAM(computadora.getConsumoEnRAM()+(5*enabledPrograms));

        System.out.println("Programas abiertos: "+enabledPrograms);
        for (Map.Entry<String,Programa> entry:enabledProgMap.entrySet()){
            System.out.println("- "+entry.getKey() +" ("+entry.getValue().getVersion()+")");
        }
        System.out.println("Consumo en RAM: "+computadora.getConsumoEnRAM()+"%");
        System.out.println("Consumo en CPU: "+computadora.getConsumoEnCPU()+"%");
        System.out.println("********************");

    }
}
