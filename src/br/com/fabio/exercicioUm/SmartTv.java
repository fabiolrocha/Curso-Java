package br.com.fabio.exercicioUm;

public class SmartTv {

    boolean estado = true;

    int canal = 2;

    int volume = 5;
    
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanalMais() { 
        canal++;
    }

    public void mudarCanalMenos() {
        canal--;
    }
}


