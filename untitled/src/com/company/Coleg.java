package com.company;

import java.util.Scanner;

public class Coleg {
    private String nume;


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void gasireNume(){
        Scanner in = new Scanner(System.in);
        int incercari = 0;
        boolean stringsEqual;
        do{
            System.out.println("Introduceti numele:");
            String intrare = in.nextLine();
            if(intrare.compareTo(nume) != 0){
                stringsEqual = false;
            }else{
                stringsEqual = true;
            }
            incercari++;
        }while (!stringsEqual);

        System.out.println("Ati gasit numele dupa " + incercari + " incercari.");
    }
}
