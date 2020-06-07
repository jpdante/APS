
package br.anhembi.aps;

import br.anhembi.aps.model.Elemento;
import br.anhembi.aps.model.MonstroBatalha;
import br.anhembi.aps.structure.MBBSTree;

import java.util.Scanner;

/*
 * Felipe Castro Marques - 21259039
 * João Pedro Caires dos Santos Dante - 21321117
 * Nícolas Ribeiro Marques - 21279441
 * Gabriel Santana Mascena - 21265810
 */
public class Main {

    public static void main(String[] args) {
        new Main().run(args);
    }

    public boolean isRunning;
    public final Scanner scanner;

    public Main() {
        isRunning = true;
        scanner = new Scanner(System.in);
    }

    public void run(String[] args) {
        MBBSTree<MonstroBatalha> mbbsTree = new MBBSTree();
        mbbsTree.insertItem(new MonstroBatalha("Blastoise", Elemento.AGUA, 530, 4));
        mbbsTree.insertItem(new MonstroBatalha("Dragonite", Elemento.DRAGAO, 600, 5));
        mbbsTree.insertItem(new MonstroBatalha("Pikachu", Elemento.ELETRICIDADE, 430, 9));
        mbbsTree.insertItem(new MonstroBatalha("Charizard", Elemento.FOGO, 534, 2));
        mbbsTree.insertItem(new MonstroBatalha("Onix", Elemento.TERRA, 385, 1));
        mbbsTree.insertItem(new MonstroBatalha("Butterfree", Elemento.VENTO, 395, 8));
        mbbsTree.insertItem(new MonstroBatalha("Psyduck", Elemento.AGUA, 320, 10));
        mbbsTree.insertItem(new MonstroBatalha("Electrode", Elemento.ELETRICIDADE, 490, 3));
        mbbsTree.insertItem(new MonstroBatalha("Arcanine", Elemento.FOGO, 555, 4));
        mbbsTree.insertItem(new MonstroBatalha("Dugtrio", Elemento.TERRA, 425, 9));

        while(isRunning) {
            try {
                System.out.println("---MENU---\n" +
                        "1.Buscar pokemon em Pré-Ordem pelo atributo poder\n" +
                        "2.Buscar pokemon em Pós-Ordem com atributo poder\n" +
                        "3.Buscar pokemon em Pré-Ordem com atributo carisma\n" +
                        "4.Buscar pokemon em Pós-ordem com atributo carisma");

                switch (scanner.nextLine()) {
                    case "1":
                        mbbsTree.traversingPowerPreOrder();
                        break;
                    case "2":
                        mbbsTree.traversingPowerPostOrder();
                        break;
                    case "3":
                        mbbsTree.traversingCharismaPreOrder();
                        break;
                    case "4":
                        mbbsTree.traversingCharismaPostOrder();
                        break;
                    default:
                        System.out.println("Comando desconhecido!");
                        break;
                }
                System.out.println("Deseja continuar? (S/n)");
                String result = scanner.nextLine();
                if(!result.equalsIgnoreCase("") && !result.equalsIgnoreCase("s")){
                    isRunning = false;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
