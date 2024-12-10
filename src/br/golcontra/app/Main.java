package br.golcontra.app;
import br.golcontra.model.Voo;
import br.golcontra.model.Aviao;
import br.golcontra.model.Helicoptero;

// no momento estamos descrevendo o nosso projeto como uma abstração embrionária de um sistema de identificação
// ou catalogação de aeronaves que pode estar presente em um aeroporto ou em uma empresa que fornece serviços
// privados de transporte aereo exclusivos

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
        aviao.setCargaTransporte(false);

        // Istanciamos uma classe voo para podermos criar a nossa ficha de voo, cada avião deve possuir uma ficha de voo
        // ATIVA para poder decolar do nosso aeroporto

        Voo voo = new Voo("Sao paulo", "Brasilia", 40, 150);

        // o record object voo é passado como PARÂMETRO para o nosso metodo de criação de ficha
        aviao.criarFichaDeVoo(voo);

        System.out.println("-----------");

        // O record object voo é passada como parâmetro para a nossa função de exibição de ficha também!
        aviao.exibirFichaDeVoo(voo);

        System.out.println("-----------");

        // antes: redundância de parâmetros
        // aviao.decolar("Sao paulo", "Brasilia", 40, 150)

        aviao.decolar(voo);
        // depois: apenas um record object é passado, sem precisar repetir parametros extensos!
        aviao.voar();
        aviao.pousar();

        Aviao aviao2 = new Aviao();
        aviao2.setTipoMotor("Turbohelice");
        aviao2.setModelo("Aviao da fazenda");
        aviao2.setIdentificador("154623");
        aviao2.setCapacidadePassageiros(30);
        aviao2.setPesoCarga(100);
        aviao2.setCargaTransporte(false);

        Voo voo2 = new Voo("Marabá", "Belém", 15, 90);

        aviao2.criarFichaDeVoo(voo2);

        System.out.println("-----------");

        aviao2.exibirFichaDeVoo(voo2);

        System.out.println("-----------");

        aviao2.decolar(voo2);
        aviao2.voar();
        aviao2.pousar();

        /*System.out.println("\t Seja bem vindo ao nosso aeroporto!");

        System.out.println("--------------------------------");

        Helicoptero helicoptero = new Helicoptero();
        helicoptero.decolar();
        helicoptero.voar();
        helicoptero.pousar(); */
        
    }
}