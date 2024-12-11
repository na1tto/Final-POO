package br.golcontra.model;

public class Helicoptero extends VeiculoVoador {

    private int numPas;

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

    public void exibirFichaDeVoo(Voo voo){
        if(isPossuiFicha()){
            System.out.println
                    ("Modelo: " + getModelo() + " \n"
                            + "Tipo de Motor: " + getTipoMotor() + " \n"
                            + "Numero de pas: " + getNumPas() + " \n"
                            + "Identificador: " + getIdentificador() + " \n"
                            + "Tipo de transporte: " + getCargaTransporte() + " \n"
                            + "Origem: " + voo.getOrigem() + " \n"
                            + "Destino: " + voo.getDestino() + " \n"
                            + "Passageiros: " + voo.getQntPassageiros() + "/" + getCapacidadePassageiros() + "\n"
                            + "Carga: " + voo.getPeso() + "/" + getPesoCarga());
        }else{
            System.out.println("Ficha de voo inexistente. \n");
        }
    }

    public int getNumPas() {
        return numPas;
    }

    public void setNumPas(int numPas) {
        this.numPas = numPas;
    }
}