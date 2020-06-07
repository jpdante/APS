package br.anhembi.aps.structure;

/*
 * Felipe Castro Marques - 21259039
 * João Pedro Caires dos Santos Dante - 21321117
 * Nícolas Ribeiro Marques - 21279441
 * Gabriel Santana Mascena - 21265810
 */

public class Node <Type extends MonsterComparable<Type>> {
    protected Type data;
    protected Node<Type> left;
    protected Node<Type> right;

    public Node(Type data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
