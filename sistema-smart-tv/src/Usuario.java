public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Status: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status: " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status: " + smartTv.ligada);
        
        smartTv.mudarCanal(10);
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo volume: " + smartTv.volume);




}
}