package br.anhembi.aps.model;

public class MonstroBatalha {

    private String nome;
    private Elemento elemento;
    private int poderLuta;
    private int carisma;

    public MonstroBatalha(String nome, Elemento elemento, int poderLuta, int carisma) {
        this.nome = nome;
        this.elemento = elemento;
        this.poderLuta = poderLuta;
        this.carisma = carisma;
    }

    public String getNome() {
        return nome;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public int getPoderLuta() {
        return poderLuta;
    }

    public int getCarisma() {
        return carisma;
    }

    @Override
    public String toString() {
        return nome + " ( P = " + poderLuta + " | C = " + carisma + " )";
    }
}
