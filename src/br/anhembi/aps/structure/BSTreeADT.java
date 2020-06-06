package br.anhembi.aps.structure;

public interface BSTreeADT <Type extends Comparable<Type>> {
    public boolean isEmpty();
    
    public void insertItem(Type data);
    public void traversingPreOrder();
    public void traversingInOrder();
    public void traversingPostOrder();
    
    public boolean contains(Type data);
    public void delete(Type data);
}
