package br.golcontra.model;

// a classe Voo serve para armazenar os atributos relevantes para criar uma ficha de voo (não so isso), uma classe
// que apenas armazena
// valores é chamada de record class. a utilização de record classes facilita a passagem de parâmetros durante o código,
// permitindo facilitar chamadas de métodos (eu acho), pois só é passado o objeto voo como parâmetro,
// e não um monte de dados repetidos

public record Voo(String origem, String destino, int qntPassageiros, double peso) {

    public Voo(String origem, String destino, int qntPassageiros, double peso){
        this.origem = origem;
        this.destino = destino;
        this.qntPassageiros = qntPassageiros;
        this.peso = peso;
    }

    // a maior característica dessa classe é não possuir setter, apenas getters!
    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public int getQntPassageiros() {
        return qntPassageiros;
    }

    public double getPeso() {
        return peso;
    }
}
