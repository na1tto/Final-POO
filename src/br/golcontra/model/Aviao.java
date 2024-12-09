package br.golcontra.model;

public class Aviao extends VeiculoVoador {

    private String companhiaAerea;
    private String[] classeVoo;


    @Override
    public void decolar(Voo voo) {
        // REGRA DE NEGÓCIO: a areonave só deve decolar se possuir uma ficha de voo ATIVA.
       boolean fichaCriada = criarFichaDeVoo(voo);

        if (fichaCriada){
            System.out.println("O " + getModelo() + " esta decolando");
        } else {
            System.out.println("Impossivel decolar o " + getModelo());
        }
    }

    @Override
    public void voar(){
        System.out.println("O " + getModelo() + " esta voando");
    }

    @Override
    public void pousar(){
        System.out.println("O " + getModelo() + " esta pousando");
    }
}
