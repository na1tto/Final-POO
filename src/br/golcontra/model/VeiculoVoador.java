    package br.golcontra.model;

public abstract class VeiculoVoador {

    private String tipoMotor;
    private String modelo;
    private String identificador;
    private int capacidadePassageiros;
    private double pesoCarga;
    private boolean cargaTransporte;

    public void decolar(Voo voo){}

    public abstract void voar();

    public abstract void pousar();

    // O metodo de criacao de ficha recebe como parametro uma instancia da classe Voo
    public boolean criarFichaDeVoo(Voo voo){
        if (voo.getQntPassageiros() > capacidadePassageiros || voo.getPeso() > pesoCarga){
            System.out.println("A areonave não possui uma ficha de voo ativa (numero de passageiros ou peso invalidos)");
            return false;
        } else {
            System.out.println("Ficha de voo ativa! \n");
            return true;
        }
    }
    public void exibirFichaDeVoo(Voo voo){System.out.println
                                ("Modelo: " + getModelo() + " \n"
                                + "Tipo de Motor: " + getTipoMotor() + " \n"
                                + "Identificador: " + getIdentificador() + " \n"
                                + "Origem: " + voo.getOrigem() + " \n"
                                + "Destino: " + voo.getDestino() + " \n"
                                + "Passageiros: " + voo.getQntPassageiros() + "/" + getCapacidadePassageiros() + "\n"
                                + "Carga: " + voo.getPeso() + "/" + getPesoCarga());

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
