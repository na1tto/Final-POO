package br.golcontra.model;

public class Helicoptero extends VeiculoVoador {

    private int numHelices;

    @Override
    public void decolar(Voo voo) {
        super.decolar(voo);
        if (isPossuiFicha()) {
            System.out.println("O " + getModelo() + " esta decolando...");

        }
    }

    @Override
    public void voar() {
        super.voar();
        if (getIsVoando()) {
            System.out.println("O " + getModelo() + " esta voando...");
        }
    }

    @Override
    public void pousar(){
        super.pousar();
        if (getIsVoando()){
            System.out.println("O " + getModelo() + " esta pousando...");
        }
    }

    public int getNumHelices() {
        return numHelices;
    }

    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }
}