package br.golcontra.model;

public class Helicoptero extends VeiculoVoador {

    private int numHelices;


    @Override
    public void decolar(){
        System.out.println("O " + getModelo() + " esta decolando...");
    }

    @Override
    public void voar(){
        System.out.println("O " + getModelo() + " esta voando...");
    }

    @Override
    public void pousar(){
        System.out.println("O " + getModelo() + " esta pousando...");
    }

}