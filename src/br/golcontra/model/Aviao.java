package br.golcontra.model;

public class Aviao extends VeiculoVoador {

    private String companhiaAerea;
    private String[] classeVoo;

    @Override
    public void decolar(Voo voo){
        // REGRA DE NEGÓCIO: a areonave só deve decolar se possuir uma ficha de voo ATIVA.
        super.decolar(voo);
        if (isPossuiFicha()){
            System.out.println("O " + getModelo() + " esta decolando");
        }
    }

    @Override
    public void voar() {
        super.voar();
        if (getIsVoando()) {
            System.out.println("O " + getModelo() + " esta voando");
        }
    }

    @Override
    public void pousar(){
        super.pousar();
        if (getIsVoando()) {
            System.out.println("O " + getModelo() + " esta pousando");
        }
    }
}
