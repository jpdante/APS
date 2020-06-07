package br.anhembi.aps.structure;

/*
 * Felipe Castro Marques - 21259039
 * João Pedro Caires dos Santos Dante - 21321117
 * Nícolas Ribeiro Marques - 21279441
 * Gabriel Santana Mascena - 21265810
 */

public interface MonsterComparable<T> {
    int comparePowerTo(T o);
    int compareCharismaTo(T o);
}
