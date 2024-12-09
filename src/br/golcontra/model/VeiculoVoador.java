    package br.golcontra.model;

public abstract class VeiculoVoador {

    private String tipoMotor;
    private String modelo;
    private String identificador;
    private int capacidadePassageiros;
    private double pesoCarga;
    private boolean cargaTransporte;


    public abstract void decolar();

    public abstract void voar();

    public abstract void pousar();

    public boolean criarFichaDeVoo(String origem, String destino, int qntPassageiros, double peso){
        if (qntPassageiros > capacidadePassageiros || peso > pesoCarga){
            System.out.println("Quantidade de passageiros ou carga invalida");
            return false;
        } else {
            System.out.println("Ficha de voo criada com sucesso! \n"
                                + "Modelo: " + getModelo() + " \n"
                                + "Tipo de Motor: " + getTipoMotor() + " \n"
                                + "Identificador: " + getIdentificador() + " \n"
                                + "Origem: " + origem + " \n"
                                + "Destino: " + destino + " \n"
                                + "Passageiros: " + qntPassageiros + "/" + getCapacidadePassageiros() + "\n"
                                + "Carga: " + peso + "/" + getPesoCarga());
            return true;
        }
    }

    public boolean criarFichaDeVoo(){

        return true;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public boolean IsCargaTransporte(){
        return cargaTransporte;
    }

    public void setCargaTransporte(boolean cargaTransporte) {
        this.cargaTransporte = cargaTransporte;
    }


}
