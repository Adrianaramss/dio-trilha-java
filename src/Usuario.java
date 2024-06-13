public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuitVolume();
        System.out.println("canal atual"+ smartTV.canal);
        System.out.println("tv ligada? " + smartTV.ligado);
        System.out.println("canal atual " + smartTV.canal);
        System.out.println("volume atual " +smartTV.volume);

        smartTV.ligar();
        System.out.println("novo status: tv ligada? " + smartTV.ligado);
    }
}
