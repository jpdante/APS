package br.anhembi.aps.structure;

public interface MonsterComparable<T> {
    int comparePowerTo(T o);
    int compareCharismaTo(T o);
}
