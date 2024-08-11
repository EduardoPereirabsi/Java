public class Computador {
    public String marca;
    public float memoria;
    public float memoriaRam;
    public String processador;
    public String placaDeVideo;

    // Variaveis Membros //

    public boolean ligado = false;
    public int volume = 5;

    // Variaveis Membros //
    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Oi vida <3");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Tchau bb!");
    }

    public void tirarPrint() {
        System.out.println("Sua imagem foi salva");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Seu volume aumentou");
    }

    public void abaixarVolume() {
        volume--;
        System.out.println("Seu volume abaixou");

    }
}