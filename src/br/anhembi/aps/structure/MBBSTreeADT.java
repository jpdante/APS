package br.anhembi.aps.structure;

public interface MBBSTreeADT<Type extends MonsterComparable<Type>> {
    public boolean isEmpty();

    public void insertItem(Type data);
    public void traversingPowerPreOrder();
    public void traversingPowerInOrder();
    public void traversingPowerPostOrder();
    public void traversingCharismaPreOrder();
    public void traversingCharismaInOrder();
    public void traversingCharismaPostOrder();
    
    public boolean contains(Type data);
    public void delete(Type data);
}
