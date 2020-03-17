package com.company;

import java.util.Scanner;

public class Ocuurences {
    private String word;

    public void setWord(String word) {
        this.word = word;
    }

    public void numberOfOccurences(){
        char[] sir = word.toCharArray();
        Scanner userChar = new Scanner(System.in);
        System.out.println("Introduceti un caracter pt a fi cautat:");
        char c = userChar.next().charAt(0);
        int nr = 0;
        for(int i = 0; i < sir.length ; i++){
            if(sir[i] == c){
                nr++;
            }
        }
        if(nr == 0){
            System.out.println("Litera nu se gaseste in sirul dat.");
        }else if(nr == 1){
            System.out.println("Litera se gaseste o singura data.");
        }else{
            System.out.println("Litera se gaseste de " + nr + " ori.");
        }
    }
}
