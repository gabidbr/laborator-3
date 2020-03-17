package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduceti un sir de caractere:");
        String s = userInput.nextLine();
        Ocuurences ocuurences = new Ocuurences();
        ocuurences.setWord(s);
        ocuurences.numberOfOccurences();
    }
}
