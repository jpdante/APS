
package br.anhembi.aps.model;

import br.anhembi.aps.structure.MonsterComparable;

/*
 * Felipe Castro Marques - 21259039
 * João Pedro Caires dos Santos Dante - 21321117
 * Nícolas Ribeiro Marques - 21279441
 * Gabriel Santana Mascena - 21265810
 */
public class MonstroBatalha implements MonsterComparable<MonstroBatalha>{
    
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

    public int comparePowerTo(MonstroBatalha o) {
        return Integer.compare(poderLuta, o.poderLuta);
    }

    public int compareCharismaTo(MonstroBatalha o) {
        return Integer.compare(carisma, o.carisma);
    }

    @Override
    public String toString() {
        return nome + " ( P = " + poderLuta + " | C = " + carisma + " )";
    }
}
