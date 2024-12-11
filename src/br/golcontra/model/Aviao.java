package br.golcontra.model;

public class Aviao extends VeiculoVoador {

    private int numTurbinas;

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
        if (getIsVoando()){
            System.out.println("O " + getModelo() + " esta voando");
        }
    }

    @Override
    public void pousar(){
        super.pousar();
        if (getIsVoando()){
            System.out.println("O " + getModelo() + " esta pousando");
        }
    }

    @Override
    public void exibirFichaDeVoo(Voo voo){
        if(isPossuiFicha()){
            System.out.println
                    ("Modelo: " + getModelo() + " \n"
                            + "Tipo de Motor: " + getTipoMotor() + " \n"
                            + "Numero de turbinas: " + getNumTurbinas() + " \n"
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

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }
}
