package br.anhembi.aps.model;

public enum Elemento {
    agua("Água"),
    fogo("Fogo"),
    terra("Terra"),
    vento("Vento"),
    eletricidade("Eletricidade"),
    dragao("Dragão");

    public final String Name;

    Elemento(String name) {
        this.Name = name;
    }

}
