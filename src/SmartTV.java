public class SmartTV {
    boolean ligado = false;
    int canal = 25;
    int volume = 45;
    public void mudaCanal(int novocanal){
        canal = novocanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuitVolume(){
        volume--;
    }
    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }
}