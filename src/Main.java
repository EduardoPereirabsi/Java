public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        computador.marca = "Dell";
        computador.memoria = 1533;
        computador.memoriaRam = 32;
        computador.placaDeVideo = "GTX";
        computador.processador = "Intel";

        computador.ligar();
        computador.tirarPrint();
        computador.aumentarVolume();
        computador.abaixarVolume();
        computador.desligar();

        System.out.println(computador.marca);
        System.out.println(computador.memoria);
        System.out.println(computador.memoriaRam);
        System.out.println(computador.placaDeVideo);
        System.out.println(computador.processador);
    }
}