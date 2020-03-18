package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduceti fraza pentru a desparti cuvintele:");
        String phrase = userInput.nextLine();
        WordSeparator wordSeparator = new WordSeparator();
        wordSeparator.setPhrase(phrase);
        wordSeparator.splitPhrase();
    }
}
