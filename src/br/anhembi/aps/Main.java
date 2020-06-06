package br.anhembi.aps;

/*
    Felipe Castro Marques - 21259039
    João Pedro Caires dos Santos Dante - 21321117
    Nícolas Ribeiro Marques - 21279441
    Gabriel Santana Mascena - 21265810
*/

import br.anhembi.aps.model.Elemento;
import br.anhembi.aps.model.MonstroBatalha;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        new Main().run(args);
    }

    public boolean isRunning;
    public final BufferedReader reader;

    public Main() {
        isRunning = true;
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void run(String[] args) {

        new MonstroBatalha("Blastoise", Elemento.AGUA, 530, 4);
        new MonstroBatalha("Dragonite", Elemento.DRAGAO, 600, 5);
        new MonstroBatalha("Pikachu", Elemento.ELETRICIDADE, 430, 9);
        new MonstroBatalha("Charizard", Elemento.FOGO, 534, 2);
        new MonstroBatalha("Onix", Elemento.TERRA, 385, 1);
        new MonstroBatalha("Butterfree", Elemento.VENTO, 395, 8);
        new MonstroBatalha("Psyduck", Elemento.AGUA, 320, 10);
        new MonstroBatalha(" Electrode", Elemento.ELETRICIDADE, 490, 3);
        new MonstroBatalha("Arcanine", Elemento.FOGO, 555, 4);
        new MonstroBatalha("Dugtrio", Elemento.TERRA, 425, 9);

        while(isRunning) {
            try {
                switch (reader.read()) {
                    case '1':
                        break;
                    case '2':
                        break;
                    case '3':
                        break;
                    case '4':
                        break;
                    default:
                        break;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
