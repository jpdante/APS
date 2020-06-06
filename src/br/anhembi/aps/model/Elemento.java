package br.anhembi.aps.model;

public enum Elemento {
    AGUA("Água"),
    FOGO("Fogo"),
    TERRA("Terra"),
    VENTO("Vento"),
    ELETRICIDADE("Eletricidade"),
    DRAGAO("Dragão");

    public final String name;

    Elemento(String name) {
        this.name = name;
    }
}
