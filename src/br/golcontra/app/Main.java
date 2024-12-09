package br.golcontra.app;

import br.golcontra.model.Aviao;
import br.golcontra.model.Helicoptero;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------# Seja bem vindo ao nosso projeto! #-------------");

        //Coisa pra carregar!!!!!!!!!!!!!!!!!!!
        try{
            int repeticoes = 3;
            int delay = 500;

            for(int i = 0; i < repeticoes; i++){
                System.out.printf("Carregando");
                for(int j = 0; j < 3; j++){
                    Thread.sleep(delay);
                    System.out.printf(".");
                }
                Thread.sleep(delay);
                System.out.println("\r");
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("-----------");

        Aviao aviao = new Aviao();

        aviao.setTipoMotor("A Jato");
        aviao.setModelo("Aviaozinho de papel");
        aviao.setIdentificador("103860");
        aviao.setCapacidadePassageiros(50);
        aviao.setPesoCarga(150);
        aviao.setCargaTransporte(true);

        aviao.criarFichaDeVoo("Sao Paulo", "Brasilia", 40, 125);

        System.out.println("-----------");

        aviao.decolar();
        aviao.voar();
        aviao.pousar();

        /*System.out.println("\t Seja bem vindo ao nosso aeroporto!");

        System.out.println("--------------------------------");

        Helicoptero helicoptero = new Helicoptero();
        helicoptero.decolar();
        helicoptero.voar();
        helicoptero.pousar(); */
        
    }
}