package com.ifFactoty.clase;

public class Exemplu1 {

    public static void main(String[] args) {

        Angajat angajat = new Angajat();

        System.out.println(angajat.nume + " " + angajat.varsta);

        angajat.nume = "Gigel";
        angajat.varsta = 30;


        System.out.println(angajat.nume + " " + angajat.varsta);


    }


}
