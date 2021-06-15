package ejercicios.computadora;

public class Cliente {
    public static void main(String[]args){
        iEstadoComputadora state1= new Apagado();
        Computadora computadora=new Computadora();

        Programa p1=new Programa("Paint","1.0");
        Programa p2=new Programa("Krita","21.0");
        Programa p3=new Programa("Chrome","1.5");
        Programa p4=new Programa("Word","1.0");
        Programa p5=new Programa("Powerpoint","21.0");
        Programa p6=new Programa("CMD","1.58");
        Programa p7=new Programa("Eclipse","1.9");
        Programa p8=new Programa("Discord","5.0");
        Programa p9=new Programa("Edge","1.2");

        Programa p10=new Programa("GitHub","1.0");
        Programa p11=new Programa("Excel","1.0");
        Programa p12=new Programa("TLauncher","1.16");
        Programa p13=new Programa("Jigsaw Collection","1.2");
        Programa p14=new Programa("Adobe Reader","1.0");
        Programa p15=new Programa("MineSweeper","1.5");
        Programa p16=new Programa("3D Gallery ","1.0");
        Programa p17=new Programa("IntelliJ Idea","1.29");
        Programa p18=new Programa("MatLab","5.0");
        Programa p19=new Programa("Photoshop","1.2");

        Programa p20=new Programa("Android Java","1.53");
        Programa p21=new Programa("AnyDesk","1.12");
        Programa p22=new Programa("Unity","1.29");
        Programa p23=new Programa("Gallery","1.3");
        Programa p24=new Programa("Purble Place","4.2");

        Programa[] program={p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24};

        computadora.setProgramas(program);
        computadora.setState(state1);
        computadora.request();

        state1=new Prendido();
        computadora.setState(state1);
        computadora.request();

        state1=new Reiniciando();
        computadora.setState(state1);
        computadora.request();

    }

}
