package br.anhembi.aps.model;

public enum Elemento {
    AGUA("agua"),
    FOGO("fogo"),
    TERRA("terra"),
    VENTO("vento"),
    ELETRICIDADE("eletricidae"),
    DRAGAO("dragao");

    public final String name;

    Elemento(String name) {
        this.name = name;
    }
}
