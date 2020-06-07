package br.anhembi.aps.model;

/*
 * Felipe Castro Marques - 21259039
 * João Pedro Caires dos Santos Dante - 21321117
 * Nícolas Ribeiro Marques - 21279441
 * Gabriel Santana Mascena - 21265810
 */

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
