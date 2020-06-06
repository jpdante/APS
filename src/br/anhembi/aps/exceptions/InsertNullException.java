package br.anhembi.aps.exceptions;

public class InsertNullException extends RuntimeException{
    public InsertNullException(){
        super("Tentativa de inserir elemento Null na coleção");
    }
}
