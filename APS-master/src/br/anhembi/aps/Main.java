package br.anhembi.aps;

// *
// * Felipe Castro Marques - 21259039
// * João Pedro Caires dos Santos Dante - 21321117
// * Nícolas Ribeiro Marques - 21279441
// * Gabriel Santana Mascena - 21265810
// *

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
