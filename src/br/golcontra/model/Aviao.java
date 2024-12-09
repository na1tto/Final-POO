package br.golcontra.model;

public class Aviao extends VeiculoVoador {

    private String companhiaAerea;
    private String[] classeVoo;


    @Override
    public void decolar(){
        System.out.println("O " + getModelo() + " Esta decolando");
    }

    @Override
    public void voar(){
        System.out.println("O " + getModelo() + " Esta voando");
    }

    @Override
    public void pousar(){
        System.out.println("O " + getModelo() + " Esta pousando");
    }
}
