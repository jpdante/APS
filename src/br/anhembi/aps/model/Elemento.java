package br.anhembi.aps.model;

public enum Elemento {
    AGUA("Agua"),
    FOGO("Fogo"),
    TERRA("Terra"),
    VENTO("Vento"),
    ELETRICIDADE("Eletricidae"),
    DRAGAO("Dragão");

    public final String name;

    Elemento(String name) {
        this.name = name;
    }
}
