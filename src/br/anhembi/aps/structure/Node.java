package br.anhembi.aps.structure;

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
