package com.company;

public class WordSeparator {
    private String phrase;

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public void splitPhrase(){
        char[] phraseArray = phrase.toCharArray();
        for (char c : phraseArray) {
            if (c != ' ') {
                System.out.print(c);
            } else {
                System.out.println();
            }
        }
    }
}
