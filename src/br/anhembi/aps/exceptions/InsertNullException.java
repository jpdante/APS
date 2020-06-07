package br.anhembi.aps.exceptions;

/*
 * Felipe Castro Marques - 21259039
 * João Pedro Caires dos Santos Dante - 21321117
 * Nícolas Ribeiro Marques - 21279441
 * Gabriel Santana Mascena - 21265810
 */

public class InsertNullException extends RuntimeException{
    public InsertNullException(){
        super("Tentativa de inserir elemento Null na coleção");
    }
}
