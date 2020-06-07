
package br.anhembi.aps.structure;

/*
 * Felipe Castro Marques - 21259039
 * João Pedro Caires dos Santos Dante - 21321117
 * Nícolas Ribeiro Marques - 21279441
 * Gabriel Santana Mascena - 21265810
 */
public interface MBBSTreeADT <Type extends MonsterComparable<Type>>{
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
