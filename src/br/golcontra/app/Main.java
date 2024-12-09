package br.golcontra.app;
import br.golcontra.model.Voo;
import br.golcontra.model.Aviao;
import br.golcontra.model.Helicoptero;

// no momento estamos descrevendo nosso projeto como uma abstração embrionária de um sistema de identificação de aeronaves
// que pode estar presente em um aeroporto

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

        // Instanciando um avião
        Aviao aviao = new Aviao();

        aviao.setTipoMotor("A Jato");
        aviao.setModelo("Aviaozinho de papel");
        aviao.setIdentificador("103860");
        aviao.setCapacidadePassageiros(50);
        aviao.setPesoCarga(150);
        aviao.setCargaTransporte(true);

        // Istanciamos uma classe voo para podermos criar a nossa ficha de voo, cada avião deve possuir uma ficha de voo
        // ATIVA para poder decolar do nosso aeroporto

        Voo voo = new Voo("Sao paulo", "Brasilia", 40, 150);
        aviao.criarFichaDeVoo(voo);

        System.out.println("-----------");

        aviao.exibirFichaDeVoo(voo);

        System.out.println("-----------");

        // redundância de parâmetros, será necessário criar uma classe Voo para armazenar os parâmetros
        aviao.decolar(voo);
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