package br.com.fabio.exercicioUm;

public class Principal {

    public static void main(String[] arg) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Estado: " + smartTv.estado);

        System.out.println("Canal: " + smartTv.canal);

        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.mudarCanalMais();
        smartTv.mudarCanalMais();

        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.mudarCanalMenos();
        smartTv.mudarCanalMenos();
        smartTv.mudarCanalMenos();

        System.out.println("Novo canal: " + smartTv.canal);

    }

}
