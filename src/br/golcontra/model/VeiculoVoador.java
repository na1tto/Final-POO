    package br.golcontra.model;

public abstract class VeiculoVoador {

    private String tipoMotor;
    private String modelo;
    private String identificador;
    private int capacidadePassageiros;
    private double pesoCarga;
    private String cargaTransporte;
    private boolean isVoando = false;
    private boolean possuiFicha = false;

    public void decolar(Voo voo){
        if(!possuiFicha){
            System.out.println("Não é possível decolar, pois o veículo não possui ficha de voo ativa.");
            System.out.println(" ");
            this.isVoando = false;
        } else{
            this.isVoando = true;
        }
    }

    public void voar(){
        if(!this.isVoando){
            System.out.println("Não é possível voar, pois o veículo sequer decolou.");
        }
    };

    public void pousar(){
        if(!this.isVoando) {
            System.out.println("Não é possível possível pousar, pois o veículo sequer saiu do chão.");
            System.out.println(" ");
        }
    };

    // O metodo de criacao de ficha recebe como parametro uma instancia da classe Voo

    public void criarFichaDeVoo(Voo voo){

        if(this.cargaTransporte.equals("comercial")){
            if (voo.getQntPassageiros() > capacidadePassageiros || voo.getPeso() > pesoCarga) {
                System.out.println("A aeronave não possui uma ficha de voo ativa (numero de passageiros ou peso invalidos)");
                this.possuiFicha = false;
            } else {
                System.out.println("Ficha de voo ativa! \n");
                this.possuiFicha = true;
            }
        } else if (this.cargaTransporte.equals("carga")){
            if (voo.getPeso() > pesoCarga) {
                setCapacidadePassageiros(0);
                System.out.println("A aeronave não possui uma ficha de voo ativa (pesos invalidos)");
                this.possuiFicha = false;
            } else {
                System.out.println("Ficha de voo ativa! \n");
                this.possuiFicha = true;
            }
        }
    }

    public void exibirFichaDeVoo(Voo voo){
        if(possuiFicha){
                                System.out.println
                                ("Modelo: " + getModelo() + " \n"
                                + "Tipo de Motor: " + getTipoMotor() + " \n"
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

    //Setter e Getters

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
    public String getCargaTransporte(){
        return cargaTransporte;
    }

    public void setCargaTransporte(String cargaTransporte) {
        this.cargaTransporte = cargaTransporte;
    }

    public void setIsVoando(boolean isVoando){
        this.isVoando = isVoando;
    }

    public boolean getIsVoando(){
        return this.isVoando;
    }

    public boolean isPossuiFicha() {
        return possuiFicha;
    }

    public void setPossuiFicha(boolean possuiFicha) {
        this.possuiFicha = possuiFicha;
    }
}
