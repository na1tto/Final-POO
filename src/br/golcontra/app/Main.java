package br.golcontra.app;
import br.golcontra.model.Voo;
import br.golcontra.model.Aviao;
import br.golcontra.model.Helicoptero;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------# Seja bem vindo ao nosso projeto! #-------------");
        //Animação de carregamento
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
        aviao.setCargaTransporte("comercial");

        // Instanciamos uma classe voo para podermos criar a nossa ficha de voo, cada avião deve possuir uma ficha de voo
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
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println(" ");

        Aviao aviao2 = new Aviao();
        aviao2.setTipoMotor("Turbohelice");
        aviao2.setModelo("Aviao da fazenda");
        aviao2.setIdentificador("154623");
        aviao2.setPesoCarga(100);
        aviao2.setCargaTransporte("carga");

        Voo voo2 = new Voo("Marabá", "Belém", 0, 90);

        aviao2.criarFichaDeVoo(voo2);

        System.out.println("-----------");

        aviao2.exibirFichaDeVoo(voo2);

        System.out.println("-----------");

        aviao2.decolar(voo2);
        aviao2.voar();
        aviao2.pousar();

        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println(" ");

        Aviao aviao3 = new Aviao();
        aviao3.setTipoMotor("Motor de pop100");
        aviao3.setModelo("O pior");
        aviao3.setIdentificador("00000");
        aviao3.setPesoCarga(20);
        aviao3.setCapacidadePassageiros(50);
        aviao3.setCargaTransporte("comercial");

        Voo voo3 = new Voo("Canaa dos Carajas", "Tailandia", 100, 100);

        aviao3.criarFichaDeVoo(voo3);

        System.out.println("-----------");

        aviao3.exibirFichaDeVoo(voo3);

        System.out.println("-----------");

        aviao3.decolar(voo3);
        aviao3.voar();
        aviao3.pousar();

        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println(" ");

        Helicoptero helicoptero1 = new Helicoptero();

        helicoptero1.setModelo("UkiVoa");
        helicoptero1.setNumPas(4);
        helicoptero1.setCargaTransporte("comercial");
        helicoptero1.setCapacidadePassageiros(5);
        helicoptero1.setPesoCarga(200);
        helicoptero1.setTipoMotor("Chevette");
        helicoptero1.setIdentificador("6666");

        Voo voo4 = new Voo("Boca da Onca", "Xique-xique", 2, 100);

        helicoptero1.criarFichaDeVoo(voo4);

        System.out.println("-----------");

        helicoptero1.exibirFichaDeVoo(voo4);

        System.out.println("-----------");

        helicoptero1.decolar(voo4);

        helicoptero1.voar();

        helicoptero1.pousar();

        System.out.println("-----------");

    }
}